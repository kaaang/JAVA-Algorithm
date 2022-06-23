package section5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main02 {

    /*
    2. 괄호문자제거
    설명
    입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

    출력
    남은 문자만 출력한다.

    예시 입력 1
    (A(BC)D)EF(G(H)(IJ)K)LM(N)
    예시 출력 1
    EFLM
     */


    public ArrayList<Character> solution(String str){
        ArrayList<Character> answer = new ArrayList<>();

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x != ')'){
                stack.push(x);
            }else{
                while (true){
                    if(stack.peek() == '('){
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
            }
        }

        for(char x : stack){
            answer.add(x);
        }

        return answer;
    }

    public String solution2(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x==')'){
                while (stack.pop() != '(');
            }else{
                stack.push(x);
            }
        }

        for(int i=0;i<stack.size();i++){
            answer += stack.get(i);
        }


        return answer;
    }


    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();


        for(char x : T.solution(str)){
            System.out.print(x);
        }
    }


}
