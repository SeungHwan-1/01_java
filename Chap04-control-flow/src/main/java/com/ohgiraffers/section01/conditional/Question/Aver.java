package main.java.com.ohgiraffers.section01.conditional.Question;

import java.util.Scanner;

public class Aver {
    public void Averi(){
        int inum =0;
        int inum1 =0;
        int inum2 =0;
        int iPass = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 점수를 입력하세요");
        inum = sc.nextInt();
        System.out.println("두번째 점수를 입력하세요");
        inum1 = sc.nextInt();
        System.out.println("세번째 점수를 입력하세요");
        inum2 = sc.nextInt();

        if(inum < 40 ){
            iPass = 0;
        }
        else if(inum1 < 40 ){
            iPass = 0;
        }
        else if(inum2 < 40 ){
            iPass = 0;
        }
        else if((inum + inum1 + inum2)/3 >= 60)
        {
            iPass = 1;
        }
        else if((inum + inum1 + inum2)/3 < 60)
        {
            iPass = 0;
        }


        if(iPass == 0)
             System.out.println("불합격입니다");
        else if(iPass == 1)
            System.out.println("합격입니다");



    }
}
