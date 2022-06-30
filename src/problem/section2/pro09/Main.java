package problem.section2.pro09;

import java.util.*;

public class Main {


    public int solution(int n, int[][] arr){
        int answer = 0;

        int maxCol = Integer.MIN_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCro = Integer.MIN_VALUE;

        int cro1 = 0;
        int cro2 = 0;

        for(int i=0;i<n;i++){
            int col = 0;
            int row = 0;
            for(int j=0;j<n;j++){
                col += arr[i][j];
                row += arr[j][i];
                if(i==j){
                    cro1 += arr[i][j];
                    cro2 += arr[i][n-1-j];
                }
            }
            maxCol = Math.max(maxCol, col);
            maxRow = Math.max(maxRow, row);
        }

        maxCro = Math.max(cro1, cro2);
        answer = Math.max(maxCol, Math.max(maxRow, maxCro));

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

