package problem.section1.pro03;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "";

        String[] tmp = str.split(" ");

        int max = Integer.MIN_VALUE;

        for(String check : tmp){
            if(check.length() > max){
                answer = check;
                max = check.length();
            }
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
