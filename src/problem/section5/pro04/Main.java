package problem.section5.pro04;

import java.util.*;

public class Main {


    public int solution(String str){
        Stack<Integer> stack = new Stack<>();


        return stack.get(0);
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }


}
