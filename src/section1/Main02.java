package section1;

import java.util.*;

public class Main02 {
    public String solution(String str){
//        StringBuilder sb = new StringBuilder();
//        for(char x : str.toCharArray()){
//            if(Character.isUpperCase(x)){
//                sb.append(Character.toLowerCase(x));
//            }else{
//                sb.append(Character.toUpperCase(x));
//            }
//        }
//        return sb.toString();


        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();


        System.out.println(T.solution(str));
    }
}
