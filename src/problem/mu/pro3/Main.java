package problem.mu.pro3;

import java.util.Scanner;

public class Main {



    public String solution(int num) {
        String answer = "";
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(num == 0){
            return str[0];
        }
        while(num>=0){
            int check = num%10;
            answer = str[check] + answer;
            num = num/10;
        }
        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.println(T.solution(0));

    }


}
