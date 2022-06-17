package section1;

import java.util.*;

public class Main08 {


    public String solution(String str){
        String answer = "YES";

        str = str.replaceAll("[^a-zA-z]","");

        String check = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(check)){
            answer = "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main08 T = new Main08();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();


        System.out.println(T.solution(str));
    }


}
