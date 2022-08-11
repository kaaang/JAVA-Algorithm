package problem.section2.pro08;

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

        int[] answer = new int[n];
        for (int i=0;i<n;i++) {
            int check = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j]){
                    check++;
                }
            }
            answer[i] = check;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }


}
