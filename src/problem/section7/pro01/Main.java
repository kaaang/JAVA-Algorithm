package problem.section7.pro01;

import java.util.*;

public class Main {


    public void solution(int n){
        if(n == 0){
            return;
        }else{
            solution(n-1);
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        T.solution(kb.nextInt());
    }


}
