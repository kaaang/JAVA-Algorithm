package problem.section3.pro02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        ArrayList<Integer> answer = new ArrayList<>();

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

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int p1=0, p2=0;
        while (p1<n && p2<m){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            }else if(arr1[p1]<arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }


}
