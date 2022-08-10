package problem.section1.pro03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String answer = "";

        String str = kb.nextLine();
        String[] arr = str.split(" ");
        for(String x : arr){
            if(x.length()>answer.length()){
                answer = x;
            }
        }

        System.out.println(answer);

    }


}
