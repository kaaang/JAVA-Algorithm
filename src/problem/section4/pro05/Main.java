package problem.section4.pro05;

import java.util.*;

public class Main {


    public int solution(int n, int k, int[] arr){
        int answer = -1;

        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int l=j+1;l<n;l++){
                    tree.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0;

        for(int x : tree){
            cnt++;
            if(cnt == k){
                answer = x;
                break;
            }
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
