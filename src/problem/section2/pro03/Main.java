package problem.section2.pro03;

import java.util.*;

public class Main {


    public ArrayList<Character> solution(int n, int[][] arr){
        ArrayList<Character> answer = new ArrayList<>();



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        for(char x : T.solution(n, arr)){
            System.out.println(x);
        }
    }


}
