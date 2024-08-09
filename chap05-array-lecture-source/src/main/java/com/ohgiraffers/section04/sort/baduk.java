package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class baduk {
    public static void main(String[] args) {
      /*  19*19바둑판*/
        char[][] Baduk = new char[19][19];


        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                Baduk[i][j] = '.';

            }
        }
        //바둑판을 출력
        Print(Baduk);
        Scanner sc = new Scanner(System.in);

        char CPlayer1 = '●';
        char CPlayer2 = '○';

        while(true){
            System.out.println("행");
            int x = sc.nextInt();
            System.out.println("열");
            int y = sc.nextInt();
            //위치 유효성 확인
            if(x >= 1 && x <= 19 && y >= 1 && y <= 19 && Baduk[x-1][y-1] == '.'){
                Baduk[x-1][y-1] = CPlayer1;

                if (CPlayer1 == '●'){
                    CPlayer1 = '○';
                }
                else {
                    CPlayer1 = '●';
                }
            }
            else {
                System.out.println("잘못된 위치입니다");
                continue;

            }
            Print(Baduk);

        }

    }
    public static void Print(char[][] baduk) {
        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                System.out.print(baduk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
