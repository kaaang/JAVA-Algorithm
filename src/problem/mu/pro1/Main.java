package problem.mu.pro1;

import java.util.Scanner;

public class Main {


    public int solution(String phone_number){
        int answer = -1;
        if(phone_number.replaceAll("[0-9]","").replace("-","").replace("+","").length()>0){
            return -1;
        }
        String[] num = phone_number.split("-");
        if(num.length == 1){
            answer = 2;
            if(num[0].length() != 11){
                answer = -1;
            }
        }else if(num.length == 3){
            answer = 1;
            if(!num[0].equals("010")){
                answer = -1;
            }else{
                for(int i=1;i<num.length;i++){
                    if(num[i].length() != 4){
                        answer = -1;
                    }
                }
            }
        }else if(num.length == 4){
            answer = 3;
            if(!num[1].equals("10") || !num[0].equals("+82")){
                answer = -1;
            }
            for(int i=2;i<num.length;i++){
                if(num[i].length() !=4){
                    answer = -1;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String test = "123456+-aa";
        System.out.println(test.replaceAll("[0-9]","").replace("-","").replace("+",""));

        System.out.println(T.solution("0101234567a"));
    }


}


