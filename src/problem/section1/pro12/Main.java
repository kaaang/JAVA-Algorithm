package problem.section1.pro12;

import java.util.*;

public class Main {




    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String answer = "";

        int n = kb.nextInt();
        String str = kb.next().replace("#", "1").replace("*","0");

        while (str.length()>0){
            String tmp = str.substring(0,7);
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        System.out.println(answer);

    }


}
