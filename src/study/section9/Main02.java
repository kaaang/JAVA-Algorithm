package study.section9;

import java.util.*;

class Time implements Comparable<Time>{
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}

public class Main02 {


    public int solution(ArrayList<Time> arr, int n){
        int cnt = 0;

        Collections.sort(arr);

        int et = 0;

        for(Time ob : arr){
            if(ob.s >= et){
                et = ob.e;
                cnt++;
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Time(s, e));
        }

        System.out.println(T.solution(arr,n));

    }


}
