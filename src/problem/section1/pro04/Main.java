package problem.section1.pro04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        StringBuilder[] sbArr = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            sbArr[i] = new StringBuilder(kb.next());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sbArr[i].reverse());
        }

    }


}
