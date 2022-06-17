package section1;

import java.util.Locale;
import java.util.Scanner;

public class Main08_ans {


    public String solution(String s){
        String answer = "YES";

        s = s.toUpperCase(Locale.ROOT).replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(!s.equals(tmp)){
            answer = "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main08_ans T = new Main08_ans();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();


        System.out.println(T.solution(str));
    }


}
