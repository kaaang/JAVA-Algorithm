package problem.section1.pro05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        int lt = 0;
        int rt = str.length()-1;

        char[] arr = str.toCharArray();

        while (lt<rt){
            if(!Character.isAlphabetic(arr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        String answer = String.valueOf(arr);
        System.out.println(answer);

    }


}
