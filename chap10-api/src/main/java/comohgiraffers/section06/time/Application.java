package main.java.comohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {

        /*
        time 패키지는 jdk1.8에서 추가된 기능이다.
        Date ,Calendar 가 가지고 있는 단점을 해소하기 위해 탄생했다
        time 패키지의 하위 패키지


        java.time
            chrono :국제표준에 정의된 달력 시스템을 위한 클래스 제공
            format 날짜와 시간 파싱과 형식의 대한 크래스제공
            temporal 날짜와 시간 필드와 단위 관련 클래스 제공
            .zone 시간대에 관련된 기능 제공

            주로 잘 쓰는 클래스는
            LocalTime,LocalDate,LocalDateTime,ZonedDateTime 들이있다.!
         */

        LocalTime timeNowLocalTime = LocalTime.now();
        System.out.println(timeNowLocalTime);
        LocalTime timeOf = LocalTime.of(18,30,10);
        System.out.println(timeOf);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        LocalDate dateOf = LocalDate.of(2023,1,19);

        LocalDateTime dateTimenow = LocalDateTime.now();
        System.out.println(dateTimenow);
        LocalDateTime dateTimeOf = LocalDateTime.of(2023,1,19,10,30);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);
       // ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf,zoneId.of("Asia/Seoul"))
    }
}
