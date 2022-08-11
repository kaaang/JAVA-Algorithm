package problem.section2.pro05;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n+1];

        int answer = 0;
        for(int i=2; i<=n; i++){
            if(arr[i] == 0){
                answer++;
                for(int j=i; j<=n;j=j+i){
                    arr[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }


}
