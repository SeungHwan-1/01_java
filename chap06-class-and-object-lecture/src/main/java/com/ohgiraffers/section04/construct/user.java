package main.java.com.ohgiraffers.section04.construct;

import java.util.Date;

public class user {

    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;
    /*
    생성자의 작성 위치
    작성 위치는 문법상으로는 클래스내부에 작성하면 되지만,
    통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는게 관례이다.
    생성자의 사용목적
    1.인스턴스 생성 시점에 수행할 명령이 있을 경우 사용한다.
    2.매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드를
    초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
    3.작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는
    의미를 가진다. 따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용 할 수도 있다(초기값 전달 강제)

    생성자 작성 방법
    [표현식]
    접근제어자 클래스명(매개변수){
    인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
    this.필드명 = 매개변수;
    // 설정자(setter)여러 개의 기능을 한 번의 호출로 수행할 수 있다.

    생성자 작성 시 주의할 점
    1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다
    2.생성자 매소드는 반환타입을 작성하지않는다.

    생성자의 종류
    1기본 생성자(매개변수없는 생성자)
    2,매개변수 있는 생성자
    기본생성자는 자바 컴파일러가 자동으로 추가해주는 구문이지만 명시적으로 작성할수도있다.
    매개변수 있는 생성자가 한개라도 존재하는경우 기본 생성자를 자동으로 추가해주지 않기 떄문에
    기본생성자가 필요한 경우에는 반드시 명시적으로 기술 해주어야 한다.

     */

    public user(){
        System.out.println("기본생성자 호출됨");
    }

    //생성자
    public user(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public user(String name, Date enrollDate) {
        this.name = name;
        this.enrollDate = enrollDate;
    }
    //전체필드 초기화생성자

    public user(String id, String pwd,String name, Date enrollDate){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }
    public String getInfomation()
    {
        return "User id :" + this.id + "pwd :" + this.pwd +
                "name :" + this.name + "enrollDate :" + this.enrollDate;
    }
}
