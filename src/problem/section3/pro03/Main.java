package problem.section3.pro03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        int m = kb.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = m; i < n; i++) {
            sum+=(arr[i]-arr[i-m]);
            answer = Math.max(sum, answer);
        }

        System.out.println(answer);

    }


}
