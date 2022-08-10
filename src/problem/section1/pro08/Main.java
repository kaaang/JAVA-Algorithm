package problem.section1.pro08;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine().toUpperCase();
//        String s = str.replaceAll("[^A-Z]","").replace(" ","");
        String s = str.replaceAll("[^A-Z]","");

//        System.out.println(s);

        String answer = T.sol1(s);
//        String answer = T.sol2(s);

        System.out.println(answer);
    }

    public String sol1(String str){
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public String sol2(String str){
        String answer = "YES";

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return "NO";
            }
        }

        return answer;
    }


}

