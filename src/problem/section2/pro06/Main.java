package problem.section2.pro06;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        List<Integer> answer = new ArrayList<>();
        for (int x : arr) {
            int check = x;
            int tmp = 0;
            while (check>0){
                tmp *= 10;
                tmp += check%10;
                check = check/10;
            }
            if(T.isPrime(tmp)){
                answer.add(tmp);
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }


    public boolean isPrime(int n){


        if(n == 1){
            return false;
        }else{
            for(int i=2; i<(n/2)+1; i++){
                if(n%i == 0){
                    return false;
                }
            }
        }

        return true;
    }


}
