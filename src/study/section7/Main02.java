package study.section7;

import java.util.Scanner;

public class Main02 {


    public void DFS(int n){
        if(n > 0){
            DFS(n/2);
            System.out.print(n%2);
        }else{
            return;
        }
    }


    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.DFS(n);
    }


}
