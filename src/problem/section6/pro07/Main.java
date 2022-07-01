package problem.section6.pro07;

import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y-o.y;
        }else{
            return this.x-o.x;
        }
    }


}

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<Point> p = new ArrayList<>();
        for(int i=0;i<n;i++){
            p.add(new Point(kb.nextInt(), kb.nextInt()));
        }
        Collections.sort(p);

        for(Point x : p){
            System.out.println(x.x+" "+x.y);
        }
    }


}
