package problem.section8.pro12;

import java.util.*;



public class Main {


    static int n, m;
    static int[][] arr, dis;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    static Queue<Point> queue = new LinkedList<>();
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        m = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n][m];
        dis = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = kb.nextInt();
                if(arr[i][j] == 1){
                    queue.offer(new Point(i,j));
                }
            }
        }
        T.bfs();

        boolean check = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    check = false;
                    break;
                }
            }
        }

        if(check){
            int answer = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }


    }

    public void bfs(){
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i=0;i<4;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
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