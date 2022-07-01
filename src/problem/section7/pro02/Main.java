package problem.section7.pro02;

import java.util.*;

public class Main {


    public void solution(int n){
        if(n == 0){
            return;
        }else{
            solution(n/2);
            System.out.println(n%2);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        T.solution(n);
    }


}
