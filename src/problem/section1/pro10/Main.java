package problem.section1.pro10;

import java.util.*;

public class Main {


    //런타임 에러남 - 시간 줄여아함
    public ArrayList<Integer> solution(String s, char t){
        ArrayList<Integer> answer = new ArrayList<>();

        char[] tmp = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(tmp[i] != t){
                int lt = i;
                int rt = i;
                int count = 0;
                while (true){
                    count++;
                    if(lt > 0){
                        if(tmp[lt-count] == t){
                            answer.add(count);
                            break;
                        }
                    }
                    if(rt < s.length()){
                        if(tmp[rt+count] == t){
                            answer.add(count);
                            break;
                        }
                    }
                }
            }else{
                answer.add(0);
            }
        }

        return answer;
    }

    public int[] solution2(String s, char t){
        int[] answer = new int[s.length()];
        Arrays.fill(answer, Integer.MAX_VALUE);

        char[] tmp = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(tmp[i] == t){
                answer[i] = 0;
                int left = 1;
                for(int j=i-1;j>=0;j--){
                    if(tmp[j] == t) break;
                    else answer[j] = Math.min(answer[j], left++);
                }
                int right = 1;
                for(int j=i+1;j<s.length();j++){
                    if(tmp[j] == t) break;
                    else answer[j] = Math.min(answer[j], right++);
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

        for(int x : T.solution2(s, t)){
            System.out.print(x + " ");
        }
    }


}
