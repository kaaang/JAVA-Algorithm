package section1;

import java.util.Scanner;

public class Main01 {
    public int solution(String str, char c){
        int ans = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char check : str.toCharArray()){
            if(check == c){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
