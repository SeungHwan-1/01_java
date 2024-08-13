package main.java.com.ohgiraffers.section06.parameter;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        // 메소드의 파라미터에 대해 이해하고 설명할수 있다~!

        /*
        * 매개변수로 사용 가능한 자료형
        * 1.기본자료형
        * 2.기본자료형 배열
        * 3.클래스 자료형
        * 4. 클래스 자료형 배열
        * 5.가변인자
         */
        parameterTest pt = new parameterTest();

        int num = 28;
        //pt.testPtP(num);

        int[] iarr = {1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 값"+ iarr);
        pt.testPTAP(iarr);
        System.out.println("변경후 출력");
        for(int i = 0;i <iarr.length;i++){
            System.out.println(iarr[i]+ " ");
        }
        System.out.println();
      //  pt.testPTAP(iarr);
        //클래스 자료형
        rectangle ri = new rectangle(12.5,22.5);
        System.out.println("인자로 전달하는 R1의 값"+ri);
        ri.calcRound();
        ri.calcArea();
        pt.TestClassTpye(ri) ;
        System.out.println("변경후 사각형의 넓이와 둘레"+ ri);
        ri.calcRound();
        ri.calcArea();

        //가변인자
        //인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변배열을 활용할 수 있다.
        pt.TestleghtArrayParameter("홍길동");
        pt.TestleghtArrayParameter("홍길동","볼링","축구","배구","등등");
        pt.TestleghtArrayParameter("홍길동",new String[]{"테니스","서예","당구"});


    }
}