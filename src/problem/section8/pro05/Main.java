package problem.section8.pro05;

import java.util.*;

public class Main {

    static int n, total, answer = Integer.MAX_VALUE;
    static int[] arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        total = kb.nextInt();
        T.dfs(0,0);
        System.out.println(answer);
    }

    public void dfs(int level, int sum){
        if(sum > total) return;
        if(level>answer) return;
        if(sum == total){
            answer = Math.min(level, answer);
        }else{
            for(int i = n-1;i>=0;i--){
                dfs(level+1, sum + arr[i]);
            }
        }
    }


}
