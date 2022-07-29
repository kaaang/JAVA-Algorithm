package problem.section8.pro14;

import java.util.*;

public class Main {

    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};

    static int n, answer = 0;
    static int[][] arr;

    Queue<Point> q = new LinkedList<>();

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
                    answer++;
                    arr[i][j] = 0;
                    T.bfs(i, j);
                }
            }
        }

        System.out.println(answer);

    }

    public void bfs(int x, int y){
        q.offer(new Point(x, y));
        while (!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0;i<8;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] == 1){
                    arr[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }


}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
