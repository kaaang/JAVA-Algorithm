package section1;

import java.util.*;

public class Main03 {

    /*
    3. 문장 속 단어
    설명
    한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    문장속의 각 단어는 공백으로 구분됩니다.

    입력
    첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

    출력
    첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다

    예시 입력 1
    it is time to study

    예시 출력 1
    study
     */




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
