package problem.section5.pro07;

import java.util.*;

public class Main {


    public String solution(String str1, String str2){
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for(char x : str1.toCharArray()) q.offer(x);
        for(char x : str2.toCharArray()){
            if(q.contains(x)){
                if(x != q.poll()){
                    return "NO";
                }
            }
        }
        if(!q.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(T.solution(str1, str2));
    }


}
