package problem.section1.pro08;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "YES";

        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String check = new StringBuilder(str).reverse().toString();

        if(!str.equals(check)){
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

