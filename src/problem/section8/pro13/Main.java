package problem.section8.pro13;

import java.util.*;

public class Main {

    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};

    static int n, answer = 0;
    static int[][] arr;


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                    answer++;
                    T.dfs(i, j);
                }
            }
        }
        System.out.println(answer);

    }

    public void dfs(int x, int y){
        for(int i=0;i<8;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] == 1){
                arr[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }


}
