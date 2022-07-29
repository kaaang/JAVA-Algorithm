package problem.section1.pro09;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next().toLowerCase(Locale.ROOT).replaceAll("[^0-9]","");
        System.out.println(Integer.parseInt(str));

    }


}
