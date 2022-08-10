package problem.section1.pro06;

import java.util.*;

public class  Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        LinkedHashSet<Character> ts = new LinkedHashSet<>();

        String str = kb.next();
        for (char x : str.toCharArray()) {
            ts.add(x);
        }

        for (Character t : ts) {
            System.out.print(t);
        }
        System.out.println();


        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
    }


}
