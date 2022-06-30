package problem.section5.pro03;

import java.util.*;

public class Main {


    public int solution(int n, int[][] arr, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<m;i++){
            int row = moves[i];
            for(int j=1;j<=n;j++){
                if(arr[j][row]>0){
                    if(!stack.isEmpty()){
                        if(stack.peek() == arr[j][row]){
                            stack.pop();
                            answer++;
                            answer++;
                        }else{
                            stack.push(arr[j][row]);
                        }
                    }else{
                        stack.push(arr[j][row]);
                    }
                    arr[j][row] = 0;
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i=0;i<m;i++){
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr, m, moves));

    }


}
