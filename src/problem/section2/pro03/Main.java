package problem.section2.pro03;

import java.util.*;

public class Main {


    public ArrayList<Character> solution(int n, int[][] arr){
        ArrayList<Character> answer = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[0][i] == arr[1][i]){
                answer.add('D');
            }else if(arr[0][i] == 1){
                if(arr[1][i] == 2){
                    answer.add('B');
                }else if(arr[1][i] == 3){
                    answer.add('A');
                }
            }else if(arr[0][i] == 2){
                if(arr[1][i] == 3){
                    answer.add('B');
                }else if(arr[1][i] == 1){
                    answer.add('A');
                }
            }else if(arr[0][i] == 3){
                if(arr[1][i] == 1){
                    answer.add('B');
                }else if(arr[1][i] == 2){
                    answer.add('A');
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        for(char x : T.solution(n, arr)){
            System.out.println(x);
        }
    }


}
