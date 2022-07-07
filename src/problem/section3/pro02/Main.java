package problem.section3.pro02;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n, int[] a, int m , int[] b){
        ArrayList<Integer> answer = new ArrayList<>();



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            b[i] = kb.nextInt();
        }

        for(int x : T.solution(n, a, m, b)){
            System.out.print(x + " ");
        }
    }


}
