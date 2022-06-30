package problem.section2.pro12;

import java.util.*;

public class Main {

    //TODO

    public int solution(int n, int m, int[][] arr){
        int answer = 0;

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                int cnt = 0;
//                for(int k=0;k<m;k++){
//                    int pi = 0, pj = 0;
//                    for(int s=0;s<n;s++){
//                        if(arr[k][s] == i) pi = s;
//                        if(arr[k][s] == j) pj = s;
//                    }
//                    if(pi<pj) cnt++;
//                }
//                if(cnt == m){
//                    answer++;
//                }
//            }
//        }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                int cnt = 0;
                for(int k=0;k<m;k++){
                    int pi = 0, pj = 0;
                    for(int s=0;s<m;s++){
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }

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
