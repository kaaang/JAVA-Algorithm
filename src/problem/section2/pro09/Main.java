package problem.section2.pro09;

import java.util.*;

public class Main {


    public int solution(int n, int[][] arr){
        int answer = 0;

        int col = 0;
        int row = 0;
        int cross = 0;
        int corss_re = 0;

        for(int i=0;i<n;i++){
            int col_tmp = 0;
            int row_tmp = 0;
            for(int j=0;j<n;j++){
                if(i == j){
                    cross += arr[i][j];
                    corss_re += arr[j][i];
                }
                col_tmp += arr[i][j];
                row_tmp += arr[j][i];
            }
            col = Math.max(col, col_tmp);
            row = Math.max(row, row_tmp);
        }

        answer = Math.max(col, row);
        answer = Math.max(answer, cross);
        answer = Math.max(answer, corss_re);

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }


}

