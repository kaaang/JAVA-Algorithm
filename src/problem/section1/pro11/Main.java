package problem.section1.pro11;

import java.util.*;

public class Main {


    public String solution(String s){
        String answer = "";

        answer += s.charAt(0);

        int count = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            }else{
                if(count > 1){
                    answer+=""+count;
                    answer+=s.charAt(i);
                    count = 1;
                }else{
                    answer+=s.charAt(i);
                    count = 1;
                }
            }
        }

        if(count > 1){
            answer+=""+count;
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
