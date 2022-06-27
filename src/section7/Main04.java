package section7;

import java.util.Scanner;

public class Main04 {

    static int[] fibo;


    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 2;
        else{
            return fibo[n] = DFS(n-2)+DFS(n-1);
        }
    }


    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        fibo = new int[n+1];
        T.DFS(n);

        for(int i=1;i<=n;i++){
            System.out.print(fibo[i]+ " ");
        }
    }


}
