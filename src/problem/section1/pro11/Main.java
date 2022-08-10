package problem.section1.pro11;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String answer = "";

        String str = kb.next();
        answer += str.charAt(0);

        char tmp = str.charAt(0);
        int check = 1;

        for(int i=1; i<str.length();i++){
            if(tmp == str.charAt(i)){
                check++;
            }else{
                if(check > 1){
                    answer+=check;
                }
                answer+=str.charAt(i);
                tmp = str.charAt(i);
                check = 1;
            }
        }

        if(check > 1){
            answer += check;
        }

        System.out.println(answer);

    }


}
