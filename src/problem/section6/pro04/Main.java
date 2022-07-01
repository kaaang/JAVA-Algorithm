package problem.section6.pro04;

import java.util.*;

public class Main {


    public int[] solution(int s, int n, int[] arr){
        int[] c = new int[s];

        for(int x : arr){
            int pos = -1;
            for(int i=0;i<s;i++){
                if(x == c[i]){
                    pos = i;
                    break;
                }
            }
            if(pos == -1){
                for(int i=s-1;i>=1;i--){
                    c[i] = c[i-1];
                }
            }else{
                for(int i=pos;i>=1;i--){
                    c[i] = c[i-1];
                }
            }
            c[0] = x;
        }

        return c;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(s, n, arr)){
            System.out.print(x + " ");
        }
    }


}
