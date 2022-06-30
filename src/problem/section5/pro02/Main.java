package problem.section5.pro02;

import java.util.*;

public class Main {


    public Stack<Character> solution(String str){
        Stack<Character> answer = new Stack<>();

        for(char x : str.toCharArray()){
            if(x != ')'){
                answer.push(x);
            }else{
                while (answer.pop() != '(');
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        for(char x : T.solution(str)){
            System.out.print(x);
        }
    }


}
