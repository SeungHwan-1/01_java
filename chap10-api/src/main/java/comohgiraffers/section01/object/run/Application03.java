package main.java.comohgiraffers.section01.object.run;

import main.java.comohgiraffers.section01.object.book.book;

import java.util.HashMap;
import java.util.Map;

public class Application03 {

    /*
    object 클래스의 명세에 작성된 일반 규약에 따르면
    equals 메소드를 재정의 하는 경우 반드시 해쉬코드도 재정의 하도록 되어있다
    만약 해쉬코드 를 재정의 하지않으면 같은 값을 가지는
    동등객체는 같은 해쉬코드값을 가져야 한다는 규약을 위반하게 된다
    (강제성은 없지만 규약대로 하는게 좋다)
     */
    public static void main(String[] args) {

        book book1 = new book(1,"홍킬동전","허큔",50000);
        book book2 = new book(1,"홍킬동전","허큔",50000);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        //해쉬코드를 재정의 하지 않았을 때 문제점
        Map<book,String> map = new HashMap<>();
        map.put(new book(1,"홍길동전","허균",50000),"selled");

        String str = map.get(new book(1,"홍길동전","허균",50000));



        System.out.println(str);
    }
}
