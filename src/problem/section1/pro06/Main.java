package problem.section1.pro06;

import java.util.*;

public class  Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String answer = "";
        String str = kb.next();

        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == i){
//                System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
                answer += str.charAt(i);
            }
        }

        System.out.println(answer);


    }


}
