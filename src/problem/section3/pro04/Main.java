package problem.section3.pro04;

import java.util.*;

public class Main {


    public int solution(int n, int m , int[] arr){
        int answer = 0;

        int sum = 0;

        int lt = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum == m){
                answer++;
            }else if(sum>m){
                while (sum>=m){
                    sum-=arr[lt];
                    lt++;
                    if(sum == m){
                        answer++;
                    }
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
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr));
    }


}
