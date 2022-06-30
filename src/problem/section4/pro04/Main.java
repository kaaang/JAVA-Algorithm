package problem.section4.pro04;

import java.util.*;

public class Main {


    public int solution(String s, String t){
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : t.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        HashMap<Character, Integer> tmp = new HashMap<>();
        for(int i=0;i<t.length()-1;i++){
            tmp.put(s.charAt(i), tmp.getOrDefault(s.charAt(i), 0)+1);
        }
        int lt = 0;
        for(int rt=t.length()-1;rt<s.length(); rt++){
            tmp.put(s.charAt(rt), tmp.getOrDefault(s.charAt(rt),0)+1);
            if(map.equals(tmp)){
                answer++;
            }
            tmp.put(s.charAt(lt), tmp.get(s.charAt(lt))-1);
            if(tmp.get(s.charAt(lt)) == 0){
                tmp.remove(s.charAt(lt));
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
