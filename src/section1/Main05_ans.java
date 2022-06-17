package section1;

import java.util.Scanner;

public class Main05_ans {


    public String solution(String str){
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while (lt<rt){
            if(Character.isLetter(arr[lt]) && Character.isLetter(arr[rt])){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }else if(!Character.isLetter(arr[lt])){
                lt++;
            }else if(!Character.isLetter(arr[rt])){
                rt--;
            }
        }

        return String.valueOf(arr);
    }


    public static void main(String[] args) {
        Main05_ans T = new Main05_ans();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();


        System.out.println(T.solution(str));
    }


}
