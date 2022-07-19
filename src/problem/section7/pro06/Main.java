package problem.section7.pro06;

import java.util.*;

public class Main {

    static int n;
    static int[] ch;

    public void DFS(int L){
        if(L == n+1){
            for(int i=1;i<=n;i++){
                if(ch[i]==1) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }else{
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);

    }


}
