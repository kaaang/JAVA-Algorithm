package problem.section4.pro01;

import java.util.*;

public class Main {


    public char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char x : str.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x,0) +1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : hashMap.keySet()){
            if(hashMap.get(key)>max){
                max = hashMap.get(key);
                answer = key;
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
