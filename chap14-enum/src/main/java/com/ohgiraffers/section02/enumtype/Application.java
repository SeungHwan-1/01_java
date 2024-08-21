package main.java.com.ohgiraffers.section02.enumtype;



public class Application {
    public static void main(String[] args) {

        //열거 타입으로 선언된 인스턴스는ㄷ 싱글톤으로 관리된다.

        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;

        if (subject1 == subject2) {
            System.out.println("Subjects are equal");
        }
        else{
            System.out.println("Subjects are not equal");
        }

        //단일 인스턴스임을 보장하기에 비교가 가능하다.
        System.out.println((Subjects.JAVA));

        //values()를 이용ㅎ새서 상수값배열을 반환하고
        //이를 연속으로 처리할수 있다.
        Subjects[] subjects = Subjects.values();
        for(Subjects subject: subjects){
            System.out.println(subject);
        }


        //
        printSubjects(Subjects.HTML);
    }

    public static void printSubjects(Subjects subject){
        System.out.println(subject);
    }
}
