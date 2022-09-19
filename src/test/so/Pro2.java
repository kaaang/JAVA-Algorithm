package test.so;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Pro2 {

    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int[][] paths = {{1,5,1,1},{1,2,4,3},{1,3,3,2},{2,5,2,1},{2,4,2,3},{3,4,2,2}};

        Pro2 pro2 = new Pro2();
        int[] answer = pro2.sol(n, k, paths);
        for (int i : answer) {
            System.out.println(i);
        }
    }


    ArrayList<ArrayList<Edge>> graph;
    int[][] dis;
    int[] check;

    public int[] sol(int n, int k, int[][] paths){
        int[] answer = new int[2];


        //그래프 셋팅
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1][2];
        check = new int[n+1];

        //값 셋팅
        for (int i = 0; i < dis.length; i++) {
            dis[i][0] = Integer.MAX_VALUE;
            dis[i][1] = Integer.MIN_VALUE;
        }

        //가중치 그래프 셋팅
        for (int i = 0; i < paths.length; i++) {
            int a = paths[i][0];
            int b = paths[i][1];
            int time = paths[i][2];
            int mil = paths[i][3];
            graph.get(a).add(new Edge(b, time, mil));
            graph.get(b).add(new Edge(a, time, mil));
        }
        extra(1);

        answer[0] = dis[k][0];
        answer[1] = dis[k][1];

        return answer;
    }

    public void extra(int v){
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.offer(new Edge(v, 0, 0));
        dis[v][0] = 0;
        dis[v][1] = 0;
        check[v] = 1;


        while (!pq.isEmpty()){
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            int nowMil = tmp.mil;
            if(nowCost>dis[now][0]) continue;
            for(Edge ob : graph.get(now)){
                if(check[ob.vex] == 0){
                    if(dis[ob.vex][0] > nowCost+ob.cost){
                        dis[ob.vex][0] = nowCost+ob.cost;
                        dis[ob.vex][1] = tmp.mil + ob.mil;
                        check[now] = 1;
                        pq.offer(new Edge(ob.vex, nowCost+ob.cost, nowMil+ob.mil));
                    }else if(dis[ob.vex][0] == nowCost+ob.cost){
                        if(dis[ob.vex][1] < nowMil+ob.mil){
                            dis[ob.vex][1] = tmp.mil+ob.mil;
                        }
                    }
                }
            }
        }
    }


    class Edge implements Comparable<Edge>{
        int vex;
        int cost;
        int mil;

        public Edge(int vex, int cost, int mil) {
            this.vex = vex;
            this.cost = cost;
            this.mil = mil;
        }


        @Override
        public int compareTo(Edge o) {
            return this.cost-o.cost;
        }
    }
}
