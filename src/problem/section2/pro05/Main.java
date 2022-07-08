package problem.section2.pro05;

import java.util.*;

public class Main {


    public int solution(int n){
        int[] check = new int[n+1];
        int cnt = 0;

        for(int i=2;i<n;i++){
            if(check[i] == 0){
                cnt++;
                for(int j=i;j<n;j=j+i){
                    check[j] = 1;
                }
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }


}
