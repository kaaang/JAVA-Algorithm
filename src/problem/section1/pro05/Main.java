package problem.section1.pro05;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "";

        char[] check = str.toCharArray();
        int lt = 0;
        int rt = check.length-1;
        while (lt<=rt){
            if(Character.isAlphabetic(check[lt]) && Character.isAlphabetic(check[rt])){
                char tmp = check[lt];
                check[lt] = check[rt];
                check[rt] = tmp;
                lt++;
                rt--;
            }else if(!Character.isAlphabetic(check[lt])){
                lt++;
            }else if(!Character.isAlphabetic(check[rt])){
                rt--;
            }
        }

        answer = String.valueOf(check);


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }


}
