package problem.section8.pro10;

import java.util.*;

public class Main {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static int answer = 0;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int[][] arr = new int[7][7];

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        arr[0][0] = 1;

        T.dfs(0,0,arr);

        System.out.println(answer);
    }

    public void dfs(int x, int y, int[][] arr){
        if(x == 6 && y == 6){
            answer++;
        }else{
            for(int i=0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    dfs(nx, ny, arr);
                    arr[nx][ny] = 0;
                }
            }
        }
    }


}
