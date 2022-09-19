package problem.section3.pro06;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0, cnt = 0, lt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                cnt++;
            }
            while (cnt>m){
                if(arr[lt] == 0){
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, i-lt+1);
        }

        System.out.println(answer);

    }


}
