package problem.section1.pro02;

import java.util.*;

public class Main {

    public String sol(String str){
        String answer = "";

        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.sol(str));

    }


}
