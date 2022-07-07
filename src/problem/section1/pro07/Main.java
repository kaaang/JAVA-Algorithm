package problem.section1.pro07;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "YES";

        String check = new StringBuilder(str.toLowerCase(Locale.ROOT)).reverse().toString();
        if(!check.equals(str.toLowerCase(Locale.ROOT))){
            return "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }


}
