package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_Elseif {
    public void Test4() {
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
        while (true) {


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

    public void Test5() {
        /*
         *중첩된 if-else-if문 실행 흐름 확인
         * a대학의 한 교수는 학생들이 시험 성적을 수기로 계산해서 학점 등급을 매기는
         * 채점 방식을 사용하고 있엇다
         * 90점이면 a 80<이면 b70<c 60<d
         * 추가로 각등급의 중간점수는 5 +로 세분화했었다,
         * 학생의 이름과 점수를 입력하면 등급이 계산되는 프로그램만들기로
         */

        Scanner sc = new Scanner(System.in);


        System.out.print("이름이뭐니?");
        String s = sc.nextLine();
        System.out.println("점수가뭐니?");
        int a = sc.nextInt();
        String Sgrade = "";
       // String Sgo = "" ;


            if (a >= 90) {
                Sgrade = "A";
                if (a >= 95) {
                    Sgrade += "+";

                }
            }
            else if (a >= 80) {
                Sgrade = "B";
                if (a >= 85) {
                    Sgrade += "+";
                }
            } else if (a >= 70) {
                Sgrade = "B";
                if (a >= 75) {
                    Sgrade += "+";
                }
            } else if (a >= 60) {
                Sgrade = "C";
                if (a >= 65) {
                    Sgrade += "+";
                }
            } else if (a < 60) {
                Sgrade = "F";
            }
            System.out.println(s + a + Sgrade + "입니다");

           // sc.nextLine(); //엔터도 가져가는
            sc.nextLine();
            sc.nextLine();

           // System.out.println(f);


    }



       /* else if (a >= 90) {
            System.out.println(s + a + "A입니다");

        } else if (a >= 85) {
            System.out.println(s + a + "B+입니다");
        } else if (a >= 80) {
            System.out.println(s + a + "B입니다");

        } else if (a >= 75) {
            System.out.println(s + a + "C+입니다");

        } else if (a >= 70) {
            System.out.println(s + a + "C입니다");

        } else if (a >= 65) {
            System.out.println(s + a + "D+입니다");

        } else if (a >= 60) {
            System.out.println(s + a + "D입니다");

        } else if (a < 60) {
            System.out.println(s + a + "F입니다");

        }*/
    }



