package problem.section8.pro02;

import java.util.*;

public class Main {

    static int total, n, max = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        total = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        T.dfs(0,0);
        System.out.println(max);
    }

    public void dfs(int level, int sum){
        if(sum > total) return;
        if(level == n){
            max = Math.max(max, sum);
        }else{
            dfs(level+1, sum + arr[level]);
            dfs(level+1, sum);
        }
    }


}
