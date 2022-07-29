package problem.section8.pro01;

import java.util.*;

public class Main {


    static int n, sum;
    static int[] arr;
    static String answer = "NO";

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            sum += arr[i];
        }
        T.dfs(0,0);
        System.out.println(answer);
    }

    public void dfs(int level, int total){
        if(answer.equals("YES")){
            return;
        }
        if(level == n){
            if(total == sum-total){
                answer = "YES";
            }
        }else{
            dfs(level+1, total+arr[level]);
            dfs(level+1, total);
        }
    }


}
