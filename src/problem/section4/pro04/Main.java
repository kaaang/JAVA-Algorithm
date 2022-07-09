package problem.section4.pro04;

import java.util.*;

public class Main {


    public int solution(String s, String t){
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : t.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        HashMap<Character, Integer> check = new HashMap<>();
        for(int i=0;i<t.length()-1;i++){
            check.put(s.charAt(i), check.getOrDefault(s.charAt(i),0)+1);
        }
        int lt = 0;
        for(int i=t.length()-1;i<s.length();i++){
            check.put(s.charAt(i), check.getOrDefault(s.charAt(i),0)+1);
            if(check.equals(map)){
                answer++;
            }
            check.put(s.charAt(lt), check.get(s.charAt(lt))-1);
            if(check.get(s.charAt(lt)) == 0){
                check.remove(s.charAt(lt));
            }
            lt++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String s = kb.next();
        String t = kb.next();

        System.out.println(T.solution(s, t));
    }


}
