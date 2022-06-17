package section1;

import java.util.*;

public class Main07 {


    public String solution(String str){

        char[] arr = str.toCharArray();

        int lt = 0, rt = str.length()-1;
        boolean check = true;

        while (lt<rt){
            if(arr[lt] != arr[rt]){
                check = false;
                break;
            }
            lt++;
            rt--;
        }

        if(check){
            return "YES";
        }else{
            return "NO";
        }

    }


    public static void main(String[] args) {
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();


        System.out.println(T.solution(str.toUpperCase(Locale.ROOT)));
    }


}
