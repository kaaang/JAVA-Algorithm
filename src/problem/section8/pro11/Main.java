package problem.section8.pro11;

import java.util.*;


public class Main {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] arr, dis;

    static Queue<Point> queue = new LinkedList<>();
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        arr = new int[7][7];
        dis = new int[7][7];
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        T.bfs();

        if(dis[6][6] != 0){
            System.out.println(dis[6][6]);
        }else{
            System.out.println(-1);
        }
    }

    public void bfs(){
        queue.offer(new Point(0,0));

        while (!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i=0;i<4;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
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
