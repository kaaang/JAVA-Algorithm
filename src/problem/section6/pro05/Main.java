package problem.section6.pro05;

import java.util.*;

public class Main {


    public char solution(int n, int[] arr){
        char answer = 'U';



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
