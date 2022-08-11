package problem.section2.pro03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = kb.nextInt();
        }
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            bArr[i] = kb.nextInt();
        }

        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            if(aArr[i] != bArr[i]){
                if(aArr[i] == 1){
                    if(bArr[i] == 2){
                        answer[i] = 'B';
                    }else{
                        answer[i] = 'A';
                    }
                }else if(aArr[i] == 2){
                    if(bArr[i] == 3){
                        answer[i] = 'B';
                    }else{
                        answer[i] = 'A';
                    }
                }else if(aArr[i] == 3){
                    if(bArr[i] == 1){
                        answer[i] = 'B';
                    }else{
                        answer[i] = 'A';
                    }
                }
            }else{
                answer[i] = 'D';
            }
        }

        for (char c : answer) {
            System.out.println(c);
        }
    }


}
