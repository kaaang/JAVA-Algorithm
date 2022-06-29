package problem.section1.pro04;

import java.util.*;

public class Main {


    public String[] solution(int n,String[] arr){
        String[] answer = new String[n];

        for(int j=0;j<arr.length;j++){
            char[] word = arr[j].toCharArray();
            int size = arr[j].length();
            for(int i=0;i<size/2;i++){
                char tmp = word[i];
                word[i] = word[size-i-1];
                word[size-i-1] = tmp;
            }

            answer[j] = String.valueOf(word);
        }

        return answer;
    }

    public ArrayList<String> solution2(int n, String[] arr){
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

        for(String str : T.solution2(n,arr)){
            System.out.println(str);
        }
    }


}
