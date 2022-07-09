package problem.section4.pro01;

import java.util.*;

public class Main {


    public char solution(int n, String str){
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = 0;

        for(char x : map.keySet()){
            if(map.get(x)>max){
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));
    }


}
