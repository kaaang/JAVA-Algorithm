package problem.section2.pro11;

import java.util.*;

public class Main {

    public int solution(int n, int[][] arr){
        int answer=0, max=0;



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));

    }


}
