package problem.section3.pro03;

import java.util.*;

public class Main {


    public int solution(int n,int k, int[] arr){
        int answer = 0;
        int sum = 0;

        for(int i=0;i<k-1;i++){
            sum = sum+arr[i];
        }

        int lt = 0;
        for(int i=k-1;i<n;i++){
            sum+=arr[i];
            if(answer<sum){
                answer = sum;
            }
            sum-=arr[lt];
            lt++;
        }


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }


}
