package test.so;

import java.util.LinkedList;
import java.util.Queue;

public class Pro1 {

    public static void main(String[] args) {
        Pro1 pro1 = new Pro1();
        String[][] map3d1 = {{"XXXXX","OOSXO","OOXOO"},{"XEOOO","OXXXO","OOOOX"}};
        System.out.println(pro1.sol(map3d1));

        Pro1 pro2 = new Pro1();
        String[][] map3d2 = {{"OOOOO","OOOOO","OOEOO","OOOOO","OOOOO"},
                            {"OOOOO","OXXXO","OXXXO","OXXXO","OOOOO"},
                            {"OOOOO","OOOOO","OOSOO","OOOOO","OOOOO"}};
        System.out.println(pro2.sol(map3d2));

        Pro1 pro3 = new Pro1();
        String[][] map3d3 = {{"SOXX","OOXX"},{"XXOO","XXOE"}};
        System.out.println(pro3.sol(map3d3));
    }

    int col, row, height;
    int[][][] map, dis;

    int dx[] = { 1,-1,0,0 ,0,0};
    int dy[] = { 0,0,-1,1 ,0,0};
    int dz[] = { 0,0,0,0,-1,1 };

    Queue<Point> q = new LinkedList<>();
    Point end;

    public int sol(String[][] map3d){
        int answer = -1;

        col = map3d[0].length;
        row = map3d[0][0].length();
        height = map3d.length;

        map = new int[height][col][row];
        dis = new int[height][col][row];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < col; j++) {
                for (int z = 0; z < row; z++) {
                    if(map3d[i][j].charAt(z) == 'X'){
                        map[i][j][z] = 1;
                    }else if(map3d[i][j].charAt(z) == 'S'){
                        map[i][j][z] = 1;
                        q.offer(new Point(j, z, i));
                    }else if(map3d[i][j].charAt(z) == 'E'){
                        end = new Point(j,z,i);
                    }
                }
            }
        }



        bfs();

        if(dis[end.z][end.x][end.y] != 0){
            answer = dis[end.z][end.x][end.y];
        }

        return answer;

    }

    public void bfs(){
        while (!q.isEmpty()){
            Point tmp = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                int nz = tmp.z+dz[i];
                if(nx>=0 && nx<col && ny>=0 && ny<row && nz>=0 && nz<height && map[nz][nx][ny] == 0){
                    map[nz][nx][ny] = 1;
                    q.offer(new Point(nx, ny, nz));
                    dis[nz][nx][ny] = dis[tmp.z][tmp.x][tmp.y] +1;
                    //end에 도착했을때 끝내도 되지 않았을까
                    if(nx==end.x && ny == end.y && nz == end.z){
                        return;
                    }
                }
            }
        }
    }

    class Point{
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
