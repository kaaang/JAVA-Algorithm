package problem.section1.pro12;

import java.util.*;

public class Main {

    public String solution(int n, String str){
        String answer = "";

        str = str.replace('#','1').replace('*','0');

        for(int i=0;i<n;i++){
            String check = str.substring(0,7);
            answer += (char) Integer.parseInt(check, 2);
            str = str.substring(7);

        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
         int n = kb.nextInt();
         String str = kb.next();

        System.out.println(T.solution(n, str));
    }


}
