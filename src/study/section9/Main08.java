package study.section9;

import java.util.*;
class Edgeee implements Comparable<Edgeee>{
    public int vex;
    public int cost;
    Edgeee(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edgeee ob){
        return this.cost-ob.cost;
    }
}
class Main08 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        ArrayList<ArrayList<Edgeee>> graph = new ArrayList<ArrayList<Edgeee>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edgeee>());
        }
        int[] ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Edgeee(b, c));
            graph.get(b).add(new Edgeee(a, c));
        }
        int answer=0;
        PriorityQueue<Edgeee> pQ = new PriorityQueue<>();
        pQ.offer(new Edgeee(1, 0));
        while(!pQ.isEmpty()){
            Edgeee tmp=pQ.poll();
            int ev=tmp.vex;
            if(ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for(Edgeee ob : graph.get(ev)){
                    if(ch[ob.vex]==0) pQ.offer(new Edgeee(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}