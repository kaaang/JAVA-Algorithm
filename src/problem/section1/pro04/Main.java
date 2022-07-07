package problem.section1.pro04;

import java.util.*;

public class Main {


    public ArrayList<String> solution(int n,String[] arr){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : arr){
            answer.add(new StringBuilder(x).reverse().toString());
        }



        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.next();
        }

        for(String str : T.solution(n,arr)){
            System.out.println(str);
        }
    }


}
