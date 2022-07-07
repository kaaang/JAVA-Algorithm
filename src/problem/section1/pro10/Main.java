package problem.section1.pro10;

import java.util.*;

public class Main {


    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == t){
                answer[i] = 0;
                int left = 1;
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(j) != t){
                        if(answer[j] > left){
                            answer[j] = left;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                    left++;
                }
                int right = 1;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j) != t){
                        if(answer[j] > right){
                            answer[j] = right;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                    right++;
                }
            }
        }




        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String s = kb.next();
        char t = kb.next().charAt(0);

        for(int x : T.solution(s, t)){
            System.out.print(x + " ");
        }
    }


}
