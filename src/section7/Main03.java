package section7;

import java.util.Scanner;

public class Main03 {


    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }


    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(T.DFS(n));
//        T.DFS(n);
    }


}
