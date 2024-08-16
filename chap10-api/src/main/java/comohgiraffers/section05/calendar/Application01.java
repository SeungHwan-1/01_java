package main.java.comohgiraffers.section05.calendar;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /*
        DATE 클래스
        jdk 1.0 부터 날짜를 취급하기 위해 사용되던 date 클래스는
        생성자를 비롯하여 대부분의 메소드가 Deprecated 되어있다.

        Deprecated?
        향후 버전이 업데이트 되면서 사라지게 될 기능이니
        가급적 사용을 권장하지 않는다는 말이다.
        히ㅏ지만 하위버전의 호환성 때문에 하번에 제거되는 것은 아니고
        남겨두었기 때문에 사용하는 것은 가능하다.

        jdk1.1부터는 calendar클래스를 이용하여 날짜와 시간을 처리했다
        하지만 calendar클래스는 몇가지 문제를 가지고 있다
        (하지만 아직 많이들 사용하고있음)

        1. Calender 인스턴스는 불변 객체가 아니기 때문에
        값을 수정할 수 있다. 유지보수 악영향

        2. 윤초를 고려하지 않는다.

        3. Calendar 클래스는 월을 0-11까지 표현하는 불편함이 있다.

         */

        Date today = new Date();

        System.out.println(today);

        System.out.println(today.getTime());

        Date time = new Date(1723786255195L);
        System.out.println(time);



    }
}