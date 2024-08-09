package main.java.com.ohgiraffers.section02;

public class Application {
    public static void main(String[] args) {
        //2차원 배열도 선언과 할당을 동시에 할 수 있다.
        //정변 배우ㅕㄹ
        int[][] iarr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.print(iarr1[i][j] + " ");
            }
            System.out.println();
        }
        //2.가변배열
        int[][] iaar2 = {{1, 2, 3}, {4, 5, 6, 7},{8, 9, 10, 11, 12}};

        for (int i = 0; i < iaar2.length; ++i) {
            for (int j = 0; j < iaar2[i].length; j++) {
                System.out.print(iaar2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(iaar2[0].hashCode());
        System.out.println(iaar2.hashCode());
    }

}

