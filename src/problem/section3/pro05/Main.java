package problem.section3.pro05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int sum = 0;
        int answer = 0;
        int lt = 1;
        for (int i = 1; i <= n/2+1; i++) {
            sum+=i;
            if(sum == n){
                answer++;
            }
            while (sum>n){
                sum-=lt;
                lt++;
                if(sum == n){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }


}
