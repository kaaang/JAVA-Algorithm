package problem.section6.pro10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public int count(int[] arr, int dist){
        int cnt = 1;

        return cnt;
    }



    public int solution(int n, int c , int[] arr){
        int answer = 0;



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }


}
