package section1;

import java.util.*;

public class Main04 {


    public String[] solution(String[] arr){
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }

        return arr;
    }


    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();

        String[] arr = new String[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = kb.next();
        }

        String[] ans = T.solution(arr);

        for(String s : ans){
            System.out.println(s);
        }
    }


}

