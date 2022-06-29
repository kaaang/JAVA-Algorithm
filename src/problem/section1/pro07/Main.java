package problem.section1.pro07;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "YES";

        str = str.toLowerCase(Locale.ROOT);
        for(int i=0;i<str.length()/2;i++){
             if(str.charAt(i) != str.charAt(str.length()-1-i)){
                 return "NO";
             }
        }

        return answer;
    }

    public String solution2(String str){
        String answer = "NO";
        str = str.toLowerCase(Locale.ROOT);
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            return "YES";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution2(str));
    }


}
