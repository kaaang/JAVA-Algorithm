package problem.section1.pro03;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "";

        String[] check = str.split(" ");
        for(String x : check){
            if(x.length() > answer.length()){
                answer = x;
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
