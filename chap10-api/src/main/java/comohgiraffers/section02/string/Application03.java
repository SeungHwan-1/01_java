package main.java.comohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {
        /*
        문자열 분리
        - 문자열을 특정 구분자로 분리한 문자열을 반환하는 기능

        split(); 정규표현식을 이용하여 문자열을 분리한다.
        비정형화된 문자열을 분리할 때 좋지만
        정규표현식을 이욯하기 때문에 속도가 느리다는 단점을 가진다.
        정규표현식은 자바에서 다루지 않고 자바스크립트에서 다룰 예정이다
        StringTokenizer: 문자열의 모든 문자들을 구분자로 하여 문자열을
        정형화된 문자열 패턴을 분리할 때 사용하기 조ㅓㅎ다.
        split 보다 속도면에서 더 빠르다
         */
        String emp1 = "100/홍길동/서울/영업부"; //다존재
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");  // 슬래쉬기준으로 짜르기

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println(i+empArr1[i]);
        }
        for (int i = 0; i < empArr2.length; i++) {
            System.out.println(i+empArr2[i]);
        }
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println(i+empArr3[i]);
        }

        String[] empArr4 = emp3.split("/", -1); // 음수는 끝까지 인덱스 포함해서 쪼개는것

        for (int i = 0; i < empArr4.length; i++) {
            System.out.println(i+empArr4[i]);
        }


        StringTokenizer st1 = new StringTokenizer(emp1, "/"); // / 생략하면  공백을 구분자로 인식합니다.
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) {
            System.out.println("str1 : " + st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            System.out.println("str1 : " + st2.nextToken());
        }
        while (st3.hasMoreTokens()) {
            System.out.println("str1 : " + st3.nextToken());
        }

        String colorStr = "red*orange#blue/yello green";
       // String[] colorArr = colorStr.split("*#/"); 안됨 왜냐면 정규표현
        StringTokenizer colorStrToken = new StringTokenizer(colorStr, " *#/");

        while (colorStrToken.hasMoreTokens()) {
            System.out.println(colorStrToken.nextToken());
        }
    }
}
