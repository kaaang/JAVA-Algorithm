package problem.section1.pro07;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String answer = "NO";
        String str = kb.next().toLowerCase(Locale.ROOT);
        String revers = new StringBuilder(str).reverse().toString();

        if(str.equals(revers)){
            answer = "YES";
        }
        System.out.println(answer);

    }


}
