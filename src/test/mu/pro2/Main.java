package test.mu.pro2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public int solution(int[] numbers) {
        int answer = -1;

        int check = numbers.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : numbers){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(int x : map.keySet()){
            if(map.get(x)>check){
                if(answer != -1){
                    if(map.get(x) > map.get(answer)){
                        answer = x;
                    }
                }else{
                    answer = x;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);


    }

}
