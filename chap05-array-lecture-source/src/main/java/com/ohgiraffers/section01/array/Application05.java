package main.java.com.ohgiraffers.section01.array;

public class Application05 {
    public static void main(String[] args) {
        int [][] iarry = new int[5][5];

        for (int i = 1; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                iarry[i][j] = i * j;
                System.out.println(iarry[i][j]);
            }
        }
    }
}
