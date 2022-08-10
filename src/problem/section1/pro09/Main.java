package problem.section1.pro09;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);


        String str = kb.next();
        String tmp = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)){
                tmp += x;
            }
        }

        System.out.println(Integer.parseInt(tmp));

    }


}
