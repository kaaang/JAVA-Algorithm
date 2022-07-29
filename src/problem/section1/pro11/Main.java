package problem.section1.pro11;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);


        String str = kb.next();
        str += " ";

        String answer = "";

        int cnt = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer+=str.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);
                    cnt=1;
                }
            }
        }

        System.out.println(answer);

    }


}
