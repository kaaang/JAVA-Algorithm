package problem.section3.pro01;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr){
        ArrayList<Integer> answer = new ArrayList<>();

        int s1 = 0, s2 = 0;

        while (s1 < n && s2 < m){
            if(nArr[s1] < mArr[s2]){
                answer.add(nArr[s1]);
                s1++;
            }else if(nArr[s1] > mArr[s2]){
                answer.add(mArr[s2]);
                s2++;
            }else{
                answer.add(nArr[s1]);
                s1++;
                answer.add(mArr[s2]);
                s2++;
            }
        }

        if(s1<n){
            for(int i=s1; i<n;i++){
                answer.add(nArr[i]);
            }
        }else if(s2<m){
            for(int i=s2; i<m;i++){
                answer.add(mArr[i]);
            }
        }

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
