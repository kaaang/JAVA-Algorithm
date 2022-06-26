package section7;

import java.util.*;

public class Main01 {


    public void DFS(int n){
        DFS(n-1);
    }


    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.DFS(n);
    }


}
