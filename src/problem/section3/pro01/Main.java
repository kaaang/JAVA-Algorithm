package problem.section3.pro01;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr){
        ArrayList<Integer> answer = new ArrayList<>();



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] nArr = new int[n];
        for(int i=0;i<n;i++){
            nArr[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] mArr = new int[m];
        for(int i=0;i<m;i++){
            mArr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, nArr, m, mArr)){
            System.out.print(x + " ");
        }
    }


}
