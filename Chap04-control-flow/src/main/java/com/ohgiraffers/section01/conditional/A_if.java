package main.java.com.ohgiraffers.section01.conditional;
import java.util.Scanner;
public class A_if
{


    public void testSimpleIfSatatement()
    {
        /*
        *if문 표현식
        * if(조건식)
        * {
        *   조건식이 true 일 때 실행할 명령문.
        * }
        *
        * 조건식 : true or false 가 나오는 연산식을
        * 조건식 이라고 한다. if문은 조건식의 결과 값이
        * 참 이면 {} 안에 있는 코드를 실행하고,
        * 조건식의 결과 값이 거짓이면 {} 안에
        * 코드를 무시하고 넘어간다.
         */

        // 정수 한 개를 입력 받아 그 수가 짝수이면
        // "입력하신 숫자는 짝수입니다 " 를 출력해본다.
        // 단, 조건에 상관 없이 프로그램이 종료될 때
        //프로그램을 종료합니다 라고 출력해본다.


        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int a = sc.nextInt();
        if(a % 2 ==0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        }
        else {
            System.out.println("짝수가 아닙니다. 프로그램이 종료됩니다");
        }

    }

    public void TestTwo(){
        // 중첩된 if문 실행 흐름 확인
        // 앵수인 경우에만 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("정수(음수제외를 입력해주세요");
        int a = sc.nextInt();
        if(a >= 0) {
            if (a % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수 입니다.");
            } else {
                System.out.println("짝수가 아닙니다. 프로그램이 종료됩니다");
            }
        }
        else {
            System.out.println("음수입니다. 프로그램이 종료됩니다");
        }

    }


}
