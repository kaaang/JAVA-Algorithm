package problem.section2.pro12;

import java.util.*;

public class Main {


    public int solution(int n, int m, int[][] arr){
        int answer = 0;



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));
    }


}
