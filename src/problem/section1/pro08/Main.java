package problem.section1.pro08;

import java.util.*;

public class Main {


    public String solution(String str){
        String answer = "YES";


        str = str.toLowerCase(Locale.ROOT);
        int lt = 0;
        int rt = str.length()-1;
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(lt))){
                lt++;
            }else if(!Character.isAlphabetic(str.charAt(rt))){
                rt--;
            }else{
                if(str.charAt(lt) != str.charAt(rt)){
                    return "NO";
                }else{
                    lt++;
                    rt--;
                }
            }
        }

        return answer;
    }

    public String solution2(String str){
        String answer = "NO";

        str = str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[^a-z]","");
        String word = new StringBuilder(str).reverse().toString();
        if(str.equals(word)){
            return "YES";
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(T.solution2(str));
    }


}

