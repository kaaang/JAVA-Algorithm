package problem.section2.pro02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int answer = 1;
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }

        System.out.println(answer);
    }


}
