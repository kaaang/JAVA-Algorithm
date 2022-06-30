package problem.section2.pro04;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();

        int[] arr = new int[n];
        arr[0] = 1;
        answer.add(arr[0]);
        arr[1] = 1;
        answer.add(arr[1]);
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            answer.add(arr[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        for(int x : T.solution(n)){
            System.out.print(x + " ");
        }
    }


}
