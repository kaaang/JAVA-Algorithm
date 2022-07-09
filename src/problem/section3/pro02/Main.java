package problem.section3.pro02;

import java.util.*;

public class Main {


    public ArrayList<Integer> solution(int n, int[] a, int m , int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        while (p1<n && p2<m){
            if(a[p1]<b[p2]){
                p1++;
            }else if(a[p1]>b[p2]){
                p2++;
            }else{
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            if(p1 == n && p2 == m){
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            b[i] = kb.nextInt();
        }

        for(int x : T.solution(n, a, m, b)){
            System.out.print(x + " ");
        }
    }


}
