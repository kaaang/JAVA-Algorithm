package problem.section1.pro01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int answer = 0;

        String str = kb.nextLine().toLowerCase(Locale.ROOT);
        char x = kb.next().toLowerCase(Locale.ROOT).charAt(0);
//
//        for (char c : str.toCharArray()) {
//            if(x == c){
//                answer++;
//            }
//        }

        for (int i = 0; i < str.toCharArray().length; i++) {
            if(x == str.toCharArray()[i]){
                answer++;
            }
        }

        System.out.println(answer);

    }
}
