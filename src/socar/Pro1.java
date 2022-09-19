package socar;

import java.util.LinkedList;
import java.util.Queue;


/*
하나 또는 그 이상의 층으로 구성된 3차원 공간이 있습니다. 이 공간은 빈 칸과 막힌 칸으로 구성되어 있습니다. 당신은 이 공간 상에서 위, 아래, 앞, 뒤, 좌, 우 6방향으로 이동할 수 있습니다. 하지만, 막힌 칸으로는 갈 수 없습니다. 당신은 이 공간의 두 지점 사이를 가능한 한 제일 빠르게 왕래하려고 합니다.
3차원 지도 데이터 map3d가 매개변수로 주어집니다. 주어진 지도에서 시작 지점부터 끝 지점까지 가는 최단거리를 찾아 return 하도록 solution 함수를 완성해주세요. 만약 시작 지점에서 끝 지점으로 가는 것이 불가능하다면, -1을 대신 return 해주세요.
제한사항
map3d는 2차원 문자열 배열입니다.
map3d의 행의 개수는 1 이상 70 이하입니다.
map3d의 각 행은 하나의 층을 의미합니다.
map3d의 각 행의 길이는 1 이상 70 이하이며, 모두 동일합니다.
map3d의 모든 문자열의 길이는 1 이상 70 이하이며, 모두 동일합니다.
map3d의 모든 문자열은 'O', 'X', 'S', 'E'로 이루어져 있습니다.
'O'는 이동이 가능한 빈 칸을 의미합니다.
'X'는 이동이 불가능한 막힌 칸을 의미합니다.
'S'는 시작 지점을 의미하며, map3d 상에서 딱 1번만 등장합니다.
'E'는 끝 지점을 의미하며, map3d 상에서 딱 1번만 등장합니다.
입출력 예
map3d	result
[["XXXXX","OOSXO","OOXOO"],["XEOOO","OXXXO","OOOOX"]]	13
[["OOOOO","OOOOO","OOEOO","OOOOO","OOOOO"],["OOOOO","OXXXO","OXXXO","OXXXO","OOOOO"],["OOOOO","OOOOO","OOSOO","OOOOO","OOOOO"]]	6
[["SOXX","OOXX"],["XXOO","XXOE"]]	-1
*/


class Solution {

    //3차원 배열에서 이동할 수 있는 경로 반복분에 사용될 변수들
    int[] dx = {-1,0,1,0,0,0};
    int[] dy = {0,1,0,-1,0,0};
    int[] dz = {0,0,0,0,1,-1};

    /*
        x : 가로
        y : 세로
        z : 높이
    * */
    int x, y, z;

    //2차원 배열을 받아온 후 3차원 배열로 변환하여 저장할 변수
    int[][][] map;
    //map과 동일한 크기를 가지지만 최단 거리 정수를 저장하기 위한 변수
    int[][][] dis;

    Queue<Point> q = new LinkedList<>();

    //경로의 끝지점을 저장
    Point end;

    public int solution(String[][] map3d) {
        //end지점에 도달 할 수 없으면 -1 출력
        int answer = -1;


        //3차원 mapd의 크기를 지정하기 위한 메서드
        setMapSize(map3d);


        /*
        setMapSize 메서드를 통해 얻어온 값을 사용하여서
        map의 경로 저장과, 최소 경로 크기를 저장하기 위한 dis 셋팅
        */
        setMap();


        //파라미터로 받아온 map3d값을 이용한 map변수의 시작,종료지점, 갈 수 있는 길 표시
        setMapd3dToMap(map3d);

        /*
        3차원으로 갈 수 있는 경로 ds, dy, dz를 사용하여서 각 방향으로 갈 수 있는 최단거리 구하기
        * */
        bfs();


        //최단 경로중 end 지점에 도달한 최단 경로 출력
        //0일경우 도달 할 수 없음으로 -1 출력
        if(dis[end.z][end.x][end.y] != 0){
            answer = dis[end.z][end.x][end.y];
        }

        return answer;
    }

    private void setMapd3dToMap(String[][] map3d) {
        for(int i = 0; i< z; i++){
            for(int j = 0; j< x; j++){
                for(int z = 0; z< y; z++){
                    if(map3d[i][j].charAt(z) == 'X'){
                        map[i][j][z] = 1;
                    }else if(map3d[i][j].charAt(z) == 'S'){
                        map[i][j][z] = 1;
                        q.offer(new Point(j,z,i));
                    }else if(map3d[i][j].charAt(z) == 'E'){
                        end = new Point(j,z,i);
                    }
                }
            }
        }
    }

    private void setMap() {
        map = new int[z][x][y];
        dis = new int[z][x][y];
    }

    private void setMapSize(String[][] map3d) {
        x = map3d[0].length;
        y = map3d[0][0].length();
        z = map3d.length;
    }

    public void bfs(){
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0;i<6;i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                int nz = tmp.z+dz[i];
                if(nx>=0 && nx< x && ny>=0 && ny< y && nz>=0 && nz< z && map[nz][nx][ny] == 0){
                    map[nz][nx][ny] = 1;
                    q.offer(new Point(nx, ny, nz));
                    dis[nz][nx][ny] = dis[tmp.z][tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}

class Point{
    int x;
    int y;
    int z;
    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
