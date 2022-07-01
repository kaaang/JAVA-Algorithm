package problem.section8.pro05;

import java.util.*;

public class Main {

    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, int[] arr){
        if(sum>m){
            return;
        }
        if(sum==m){
            answer = Math.min(answer, L);
        }else{
            for(int i=n-1;i>0;i--){
                DFS(L+1, sum+=arr[i], arr);
            }
        }

    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();

        T.DFS(0,0, arr);

        System.out.println(answer);
    }


}
