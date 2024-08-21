package main.java.com.ohgiraffers.understand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService {

    public void ResisterStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생등로쿠 ");
        Student student = new Student();
        System.out.println("이름입력 ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("학년입력 ");
        int grade = sc.nextInt();
        student.setiStugrade(grade);
        System.out.println("학번입력 ");
        int stunum = sc.nextInt();
        student.setiStuNum(stunum);
        System.out.println("성적입력 ");
        int iScore = sc.nextInt();
        student.setiScore(iScore);
        students.add(student);

    }
    public void RemoveStudents(ArrayList<Student> students)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("지울학생학번을 적어봐요");
        int inx = sc.nextInt();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getiStuNum() == inx) {
                iterator.remove();
                System.out.println("학생을 제거했습니다.");
                return; // 학생을 찾으면 루프 종료
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }



}
