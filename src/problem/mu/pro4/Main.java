package problem.mu.pro4;


import java.util.Arrays;

public class Main {



    //  밖 탈출 플래그 넣었으면 조금 더 빨랐을거같음

    public boolean solution(int[] arr, int n) {
        boolean answer = false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            boolean check = false;
            System.out.println("check");
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j] > n){
                    check = true;
                    break;
                }
                if(arr[i] + arr[j] == n){
                    System.out.println("true");
                    check = true;
                    answer = true;
                    break;
                }
            }
            if(check) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        int[] arr = {5,3,9,13};
        System.out.println(T.solution(arr,8));

    }


}
