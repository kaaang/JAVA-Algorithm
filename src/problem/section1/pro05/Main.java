package problem.section1.pro05;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "";

        int lt = 0;
        int rt = str.length()-1;

        char[] word = str.toCharArray();

        while (lt<rt){
            if(Character.isAlphabetic(word[lt]) && Character.isAlphabetic(word[rt])){
                char tmp = word[lt];
                word[lt] = word[rt];
                word[rt] = tmp;
                lt++;
                rt--;
            }else{
                if(!Character.isAlphabetic(word[lt])){
                    lt++;
                }
                if(!Character.isAlphabetic(word[rt])){
                    rt--;
                }
            }
        }

        answer = String.valueOf(word);

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }


}
