package main.java.com.ohgiraffers.section01.intEnum;

public class Appication01 {
    public static void main(String[] args) {

        //정수 열거 패턴의 단점을 이해할 수 있다.!

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects2.HTML;

        if(subject1 == subject2)
            System.out.println("Subjects are equal");
        int num = 0;
        String subjectName = "";
        switch(num) {
            case Subjects.JAVA: subjectName = "JAVA";break;
            case Subjects.MYSQL: subjectName = "MYSQL";break;
            case Subjects.JDBC: subjectName = "JDBC";break;
        }
        System.out.println("subjectName =" + subjectName);

        //type 안전 보장 할수없다.(정수로 사용하기 떄무네 아무숫자넣어도 괜찮음 그런문제가있다.
        printSubjects( Subjects.MYSQL);
    }

    public static void printSubjects(int subjectNumber) {
        String subjectName = "";
        switch(subjectNumber) {
            case Subjects.JAVA: subjectName = "JAVA";break;
            case Subjects.MYSQL: subjectName = "MYSQL";break;
            case Subjects.JDBC: subjectName = "JDBC";break;
        }
        System.out.println("subjectName =" + subjectName);
    }





}
