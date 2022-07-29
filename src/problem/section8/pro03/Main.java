package problem.section8.pro03;

import java.util.*;

public class Main {

    static int n, totalTime;
    static int[][] arr;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        totalTime = kb.nextInt();

        arr = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        T.dfs(0,0,0);
        System.out.println(answer);

    }

    public void dfs(int level, int time, int score){
        if(time > totalTime) return;
        if(level == n){
            answer = Math.max(answer, score);
        }else{
            dfs(level+1, time+arr[level][1], score+arr[level][0]);
            dfs(level+1, time, score);
        }
    }


}
