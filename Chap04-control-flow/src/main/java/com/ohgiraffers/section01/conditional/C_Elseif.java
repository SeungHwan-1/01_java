package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_Elseif {
    public void Test4(){
        /*
         * if조건식
         * 조건식1이 트루면 실행할 명령문
         * else if 조건식2
         * else위조건 다 거짓인경우
         * 여러개의 조건을 제시하여 그 중 하나를 반드시 실행시키고 싶은 경우 사용한다
         *
         * //금도끼 은도끼 동화에서 어떤 도끼가 나무꾼도끼인지 물어보는 코드
         */
        Scanner sc = new Scanner(System.in);
       while(true) {


           System.out.println("어떤 도끼가 너의 도끼냐? 1금2은3쇠");
           int a = sc.nextInt();

           if (a == 1) {
               System.out.println("금당첨!");
               break;
           } else if (a == 2) {
               System.out.println("은당첨!");
               break;
           } else if (a == 3) {
               System.out.println("쇠당첨!");
               break;
           } else
               System.out.println("없어 다시");
       }
    }
}
