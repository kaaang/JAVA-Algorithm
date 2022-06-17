package section1;

import java.util.*;

public class Main03 {


    public String solution(String str){

//        int maxIndex = 0;
//        int maxSize = 0;
//
//        String[] array = str.split(" ");
//        for(int i=0; i<array.length; i++){
//            if(array[i].length() > maxSize){
//                maxSize = array[i].length();
//                maxIndex = i;
//            }
//        }
//        return array[maxIndex];


//        String answer = "";
//        int m = Integer.MIN_VALUE; // 가장 작은 수로 초기화
//        String[] s = str.split(" ");
//
//        for(String x : s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer = x;
//            }
//        }


        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m = len;
                answer = tmp;
            }
            if(str.length() > m){
                answer = str;
            }
            str = str.substring(pos+1);
        }


        return answer;
    }


    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();


        System.out.println(T.solution(str));
    }


}
