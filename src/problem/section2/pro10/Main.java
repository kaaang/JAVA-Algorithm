package problem.section2.pro10;

import java.util.*;

public class Main {


    public int solution(int n, int[][] arr){
        int answer = 0;
        int[] a = {-1,0,1,0};
        int[] b = {0,1,0,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<4;k++){
                    int nx = i+a[k];
                    int ny = j+b[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

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
