package Problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("aaa","111");
        Student st2 = new Student("bbb","222");
        Student st3 = new Student("ccc","333");

        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

//        for (Student stu : list) {
//            System.out.println(stu.getName());
//            System.out.println(stu.getNo());
//        }

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("계속 검색 : y, 종료 : n");
            String input = scan.next();

            if(input.equals("y")){
                System.out.println("검색 시작");
                String name = scan.next();

                boolean flag = false;

                for(Student stu : list){
                    if(stu.getName().equals(name)){
                        System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
                        flag = true;
                    }
                }

                if(!flag){
                    System.out.println("해당하는 학생 이름이 없습니다.");
                }

            }else if(input.equals("n")){
                break;
            }

        }

        System.out.println("종료 완료");

    }
}
