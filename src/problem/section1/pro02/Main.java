package problem.section1.pro02;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(x >= 97){
                x -= 32;
            }else{
                x += 32;
            }
            answer += x;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }


}
