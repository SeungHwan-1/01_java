package main.java.comohgiraffers.section01.object.run;

import main.java.comohgiraffers.section01.object.book.book; //인테리에이제서자동으로

public class Application01 {
    public static void main(String[] args) {


        /*
        * 모든 클래스는 object클래스의 후손이다.
        * 따라서 object 클래스가 가진 메소드를
        * 자신의 것 처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서
        * 사용하는 것도 가능하다.
        *
        * Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 매소드들이 있다
        * toString() equals() hashcode()이다
         */

        book book1 = new book(1,"홍킬동전","허큔",50000);
        book book2 = new book(2,"목민심서","정약용",30000);
        book book3 = new book(2,"목민심서","정약용",30000);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);  //tostring은 원래 주소값 출력해줌 지워도 똑같이 출력됨 //오버라이딩해서
        //그함수가 출력됨
    }
}
