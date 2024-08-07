package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void TestFor() {
        /*
        for 표현식

         */
        for (int i = 1; ; ++i) {
            System.out.println(i);
            if (i == 10)
                break;
        }
    }

    public void TestForEx() {
        /*
        for 표현식
        반복
         */
        int iNum = 0;
        int iResult = 0;
        for (int i = 1; i <= 10; ++i) {
            iNum = iNum + i;
            System.out.println(iNum);
        }
    }

    public void Printgugudan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력하세요 : ");
        int iFirst = sc.nextInt();
        int IResult = 0;

        if (iFirst >= 2 && iFirst <= 9) {
            for (int i = 1; i < 10; ++i) {
                IResult = iFirst * i;
                System.out.println(IResult);
            }

        }

    }

    public void Ex() {
        //숫자 두개를 입력받아서 작은수에서 큰수까지의 합계를구하시오.

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력하세요 : ");
        int iFirst = sc.nextInt();
        System.out.println("두번째 숫자입력하세요 : ");
        int iSecond = sc.nextInt();
        int IResult = 0;
        int Iresult2 = 0;

        if (iFirst < iSecond) {
            for (; iFirst <= iSecond; iFirst++) {
                IResult = Iresult2 + iFirst;
                Iresult2 = IResult;

            }

        } else if (iFirst > iSecond) {
            for (; iSecond <= iFirst; iSecond++) {
                IResult = Iresult2 + iSecond;
                Iresult2 = IResult;

            }

        }

        System.out.println(Iresult2);
    }

    public void Exx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력하세요 : ");
        int iFirst = sc.nextInt();
        System.out.println("두번째 숫자입력하세요 : ");
        int iSecond = sc.nextInt();
        int IResult = 0;
        int Iresult2 = 0;
        for (int i = iFirst; i <= iSecond; ++i) {
            boolean isTrue = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
            }
            if (isTrue == true)
                System.out.println(i);
        }

    }
}


