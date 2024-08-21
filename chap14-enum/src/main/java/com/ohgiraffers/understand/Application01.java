package main.java.com.ohgiraffers.understand;

import java.util.ArrayList;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1,학생등록  :  2,학생조회 3,학생삭제,4 ");
            int cs = sc.nextInt();

            if (cs == 1) {
                studentService.ResisterStudent(students);

            } else if (cs == 2) {
                System.out.println("몇학년을 조회하겠습니까? 4 전학년 조회");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        for (Student student : students) {
                            if (student.getiStugrade() == 1) {
                                System.out.println(student);

                            }
                        }
                        break;
                    case 2:
                        for (Student student : students) {
                            if (student.getiStugrade() == 2) {
                                System.out.println(student);

                            }
                        }
                        break;
                    case 3:
                        for (Student student : students) {
                            if (student.getiStugrade() == 3) {
                                System.out.println(student);

                            }
                        }
                    case 4: {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                        break;
                    }

                }
            }
            else if (cs == 3) {
                if(students.isEmpty())
                    System.out.println("끝");
                else
                studentService.RemoveStudents(students);
            }
        }
    }
}
