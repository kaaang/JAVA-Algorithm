package section1;

import java.util.*;

public class Main10 {

    /*
  10. 가장 짧은 문자거리
    설명
    한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    문자열의 길이는 100을 넘지 않는다.

    출력
    첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

    예시 입력 1
    teachermode e

    예시 출력 1
    1 0 1 2 1 0 1 2 2 1 0

     */


    public int[] solution(String str, String str2){

        char check = str2.charAt(0);

        int [] arr = new int[str.length()];

        char [] strArr = str.toCharArray();

        for(int i=0;i<strArr.length;i++){
            int left = i;
            int right = i;

            int count = 0;
            while (left >= 0 && right <= str.length()){
                if(strArr[left] == check || strArr[right] == check){
                    arr[i] = count;
                    break;
                }else{
                    if(left > 0){
                        left--;
                    }
                    if(right < str.length()-1){
                        right++;
                    }
                    count++;
                }
            }

        }

        return arr;

    }

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == t){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t){
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        String str2 = kb.next();

        int [] arr = T.solution(str, str2);
        for(int x : arr){
            System.out.print(x + " ");
        }

    }


}
