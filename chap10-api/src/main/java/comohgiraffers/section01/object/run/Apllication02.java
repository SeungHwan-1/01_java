package main.java.comohgiraffers.section01.object.run;

import main.java.comohgiraffers.section01.object.book.book;

public class Apllication02 {
    public static void main(String[] args) {

        /*
        * equals() 메소드 오버라이딩
        * equals 메소드는 메개 변수로 전달 받은 인스턴스와 == 연산하여
        * true or false 를 반환한다.
        * 즉 동일한 인스턴스인지 비교하는 기능을 한다.
        *
        * 동일객체와 동등객체
        * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
        * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
        *
         */

        book book1 = new book(1,"홍길동전","허균",50000);
        book book2 = new book(1,"홍길동전","허균",50000);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2)); // 동일객체만 가능하기때문에 주소값도 같아야함.
    }
}
