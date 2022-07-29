package problem.section1.pro08;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^a-z]","");
        StringBuilder sb = new StringBuilder(str);
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }


}

