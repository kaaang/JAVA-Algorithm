package problem.section6.pro04;

import java.util.*;

public class Main {


    public int[] solution(int s, int n, int[] arr){
        int[] c = new int[s];



        return c;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(s, n, arr)){
            System.out.print(x + " ");
        }
    }


}
