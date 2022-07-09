package problem.section4.pro02;

import java.util.*;

public class Main {


    public String solution(String a, String b){
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char x : b.toCharArray()){
            if(!map.containsKey(x)){
                return "NO";
            }else{
                map.put(x, map.get(x)-1);
                if(map.get(x) == 0){
                    map.remove(x);
                }
            }
        }

        if (map.size()>0){
            return "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a,b));
    }


}
