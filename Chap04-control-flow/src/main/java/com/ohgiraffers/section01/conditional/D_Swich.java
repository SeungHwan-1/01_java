package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_Swich {


    public void Swich() {
        /*
         * 스위치 비교할 변수
         * case 비교값 1: 비교값 1과 일치하는 경우 실행하는 구문 break;
         * case 비교값 2: 비교값 2과 일치하는 경우 실행하는 구문 break;
         * case 비교값 3: 비교값 3과 일치하는 경우 실행하는 구문 break;
         * default : case 모두에 해당하지 않는 경우 실행할 구문 break;
         *
         */
        Scanner sc = new Scanner(System.in);


        System.out.println("첫번째 정수입력");
        int iFirst = sc.nextInt();

        System.out.println("두번째 정수입력");
        int iSecond = sc.nextInt();

        System.out.println("연산기호입력");
        char Cp = sc.next().charAt(0);

        int iResult = 0;
        // int iKey = 1;

        switch (Cp) {
            case '+':
                iResult = iFirst + iSecond;
                break;
            case '-':
                iResult = iFirst - iSecond;
                break;
            case '*':
                iResult = iFirst * iSecond;
                break;
            case '/':
                iResult = iFirst / iSecond;
                break;
            case '%':
                iResult = iFirst % iSecond;
                break;
            default:
                System.out.println("다시");
                break;
        }
        System.out.println(iFirst + " " + Cp + " " + iSecond + " = " + iResult);
    }

    public void Swich2() {
        System.out.println("-------------------------자판기 기계-------------------------");
        System.out.println("-------------------------자판기 기계-------------------------");
        System.out.println("-------------------------자판기 기계-------------------------");

        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        int iResult = 0;
        // int iKey = 1;

        switch (Str1) {
            case "사이다":
                iResult = 500;
                break;
            case "콜라":
                iResult = 600;
                break;
            case "환타":
                iResult = 700;
                break;
            case "박카스":
                iResult = 800;
                break;

            default:
                iResult = 0;
                break;
        }
        System.out.println(Str1 + " 를선택하셨습니다");
        System.out.println(iResult + " 원을 투입해주세요");
    }
}