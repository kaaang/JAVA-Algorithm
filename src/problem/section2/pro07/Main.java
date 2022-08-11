package problem.section2.pro07;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        int check = 0;
        for (int i : arr) {
            if(i == 1){
                check++;
                answer += check;
            }else{
                check = 0;
            }
        }
        System.out.println(answer);
    }


}
