package problem.section7.pro03;

import java.util.*;

public class Main {

    static int n;
    static int sum = 1;

    public int solution(int n){
        if(n==1){
            return 1;
        }else{
            return n * solution(n-1);
        }
    }




    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        System.out.println(T.solution(n));

    }


}
