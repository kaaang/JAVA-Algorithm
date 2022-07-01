package problem.section6.pro06;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(tmp[i] != arr[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        ArrayList<Integer> answer = T.solution(n, arr);
        for (int x : answer){
            System.out.print(x + " ");
        }
    }


}
