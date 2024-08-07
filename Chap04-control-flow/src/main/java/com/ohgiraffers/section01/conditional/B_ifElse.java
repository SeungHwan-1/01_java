package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {


    public void Test3(){
        /*
        * if-else 표현식
        * if(조건식이 true 일 때 실행할 내용)
        * else
        *   false 일 때 실행할 내용
        * if else
        * 정수 한개를 입력 받아 그 수가 홀수 이면 " 입력하신 숫자는 홀수입니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("입력하신 숫자는 짝수 입니다.");
        }
        else if(a % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수 입니다.");
        }
        else{
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public void Test4() {
        /*
        *숫자하나를 받아 양수이면 입력하신숫자는양수
        * 음수이면 입력하신 숫자는 음수
        * 0이면 0입니다
        * 조건과상관없이 프로그램이 종료하면 종료됩니다.
        *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("입력하신 숫자는 양수 입니다.");
        }
        else if(a < 0) {
            System.out.println("입력하신 숫자는 음수 입니다.");
        }
        else if(a == 0) {
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        else{
            System.out.println("프로그램을 종료합니다.");
        }


    }

}
