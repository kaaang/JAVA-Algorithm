package problem.section6.pro05;

import java.util.*;

public class Main {


    public char solution(int n, int[] arr){
        char answer = 'U';

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int x : arr){
            h.put(x, h.getOrDefault(x, 0)+1);
            if(h.get(x) > 1){
                return 'D';
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }


}
