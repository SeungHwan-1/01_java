package main.java.com.ohgiraffers.section01.user_type;

import java.lang.reflect.Member;

public class Apllication01 {

    public static void main(String[] args) {

        //클래스가 무엇인지 이해하고 작성할 수 있다.

        // 1. 변수를 이용한 회원 데인터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "길동";
        int age = 20;
        char gender = '남';
        String[] Shobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("id =" + id);
        System.out.println("pass01 =" + pwd);
        System.out.println("name =" + name);
        System.out.println("age =" + age);
        System.out.println("gender =" + gender);
        for (int i = 0; i < Shobby.length; i++) {
            System.out.print(Shobby[i] + " ");
        }
        System.out.println();

    /*
    이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
    1.변수명을 다관리해야함.
    2.모든 회원정보를 인자로 메소드 호출시 값을 전달해야하면 너무많이 전달해야함
    3.리턴값은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.(서로 다른 자료형)
     */

    /*
    자료형 변수명 =new 클래스명();
    지금까지 시용한 이구문은 객체를 생성하는 구문이다.
    사용자 정의의 자료형인 클래스를 이용하기 위해서는 new연산자로 heap영역에 할당을 해야한다.
    객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체가 생성
    아이디, 비밀번호, 이름, 나이, 성별 취미를 연속된
    메모리 주소에서 사용하도록 heap에 공간을 만들었다.,
     */
        Render CMember = new Render();
    /*필드에 접근하기 위해서 래퍼런스변수명.필드명()으로 접근
    . 참조연산자 래퍼런스 변수가 참조하고있는
    주소로 접근한다 의미를 가진다 각공간을 필드명으로 접근한다.

     */
        CMember.id = "user01";
        CMember.pwd = "pass01";
        CMember.age = 20;
        CMember.gender = '남';
    }

}
