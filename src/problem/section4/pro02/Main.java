package problem.section4.pro02;

import java.util.*;

public class Main {


    public String solution(String a, String b){
        String answer = "YES";
        if(a.length() == b.length()){
            HashMap<Character, Integer> n = new HashMap<>();
            HashMap<Character, Integer> m = new HashMap<>();

            for(int i=0;i<a.length();i++){
                n.put(a.charAt(i), n.getOrDefault(a.charAt(i), 0)+1);
                m.put(b.charAt(i), m.getOrDefault(b.charAt(i), 0)+1);
            }

//            for(char key : n.keySet()){
//                if(!m.containsKey(key)){
//                    return "NO";
//                }else if(m.get(key) != n.get(key)){
//                    return "NO";
//                }
//            }

            if(!n.equals(m)){
                return "NO";
            }

        }else{
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
