package problem.section3.pro05;

import java.util.*;

public class Main {


    public int solution(int n){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for(int rt=0;rt<n;rt++){
            sum += rt;
            if(sum == n) answer++;
            while (sum>n){
                sum -= lt++;
                if(sum==n) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }


}
