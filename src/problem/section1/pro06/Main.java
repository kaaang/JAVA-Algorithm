package problem.section1.pro06;

import java.util.*;

public class Main {


    public LinkedHashSet<Character> solution(String str){
        LinkedHashSet<Character> answer = new LinkedHashSet<>();

        char[] tmp = str.toCharArray();
        for(char x : tmp){
            answer.add(x);
        }

        return answer;
    }

    public String solution2(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            //indexOf(str.charAt(i)) 는 가장 앞에 있는 문자를 리턴하는듯
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

//        System.out.println(T.solution2(str));

        for(char x : T.solution(str)){
            System.out.print(x);
        }
    }


}
