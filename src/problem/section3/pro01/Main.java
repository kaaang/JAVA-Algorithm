package problem.section3.pro01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        int[] tmp = new int[n+m];
        System.arraycopy(arr1, 0, tmp, 0, arr1.length);
        System.arraycopy(arr2, 0, tmp, arr1.length, arr2.length);

        Arrays.sort(tmp);
        for (int i : tmp) {
            System.out.print(i + " ");
        }

    }


}
