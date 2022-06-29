package problem.section1.pro01;

import java.util.*;

public class Main {


    public int solution(String check, String str){
        int answer = 0;

        check = check.toLowerCase(Locale.ROOT);
        str = str.toLowerCase(Locale.ROOT);

        char tmp = check.charAt(0);

        for(char c : str.toCharArray()){
            if(tmp == c){
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        String check = kb.next();
        System.out.println(T.solution(check, str));
    }


}
