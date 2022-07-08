package problem.section1.pro06;

import java.util.*;

public class  Main {


    public LinkedHashSet<Character> solution(String str){
        LinkedHashSet<Character> answer = new LinkedHashSet<>();

        for(char x : str.toCharArray()){
            answer.add(x);
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
