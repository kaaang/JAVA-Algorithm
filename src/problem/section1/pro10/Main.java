package problem.section1.pro10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);
        int[] answer = new int[str.length()];

        int check = 1000;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != c){
                check++;
                answer[i] = check;
            }else{
                check = 0;
            }
        }

        check = 1000;
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) != c){
                check++;
                answer[i] = Math.min(answer[i], check);
            }else{
                check = 0;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }



    }


}
