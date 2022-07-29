package problem.mu.pro5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        char[] x = str.toCharArray();
        int lt = 0;
        int rt = x.length-1;
        while (lt<rt){
            if(!Character.isAlphabetic(x[lt])){
                lt++;
            }else if(!Character.isAlphabetic(x[rt])){
                rt--;
            }else{
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(x));

    }


}
