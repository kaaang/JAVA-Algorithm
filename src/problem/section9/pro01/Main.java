package problem.section9.pro01;

import java.util.*;

public class Main {

    static int n;
    static int sum;




    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
            sum += arr[i];
        }

        dfs();
    }

    public static void dfs(){

    }


}