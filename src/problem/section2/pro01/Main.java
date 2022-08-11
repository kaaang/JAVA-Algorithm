package problem.section2.pro01;

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

        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if(arr[i-1]<arr[i]){
                answer.add(arr[i]);
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }


}
