package study.section9;

import java.util.*;

class Entry implements Comparable<Entry>{
    public int time;
    public char state;

    public Entry(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Entry o) {
        if(this.time == o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}

public class Main03 {


    public int solution(ArrayList<Entry> arr){
        int answer = Integer.MIN_VALUE;

        Collections.sort(arr);
        int cnt = 0;
        for(Entry ob : arr){
            if(ob.state == 's'){
                cnt++;
            }else{
                cnt--;
            }
            answer = Math.max(cnt, answer);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Entry> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sT = kb.nextInt();
            int eT = kb.nextInt();
            arr.add(new Entry(sT, 's'));
            arr.add(new Entry(eT, 'e'));
        }


        System.out.println(T.solution(arr));
    }


}
