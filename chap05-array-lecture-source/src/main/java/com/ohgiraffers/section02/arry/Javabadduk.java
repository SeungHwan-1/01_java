package main.java.com.ohgiraffers.section02.arry;

import java.util.Scanner;

public class Javabadduk {
    public static void main(final String[] args) {
        int[][] arr1 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int p = 0;
        int q = 0;
        while (true) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr1[i][j]);
                }
                System.out.println();

            }
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[n][m] = 1;
                  //  if(arr1[i][j])
                    System.out.print(arr1[i][j]);
                 if(arr1[n][m] == arr1[n][m+1])
                  {
                      System.out.println("이겼다");
                  }

                }
                System.out.println();

            }
            System.out.println("===================================");
         //   p = sc.nextInt();
            //  q = sc.nextInt();



        }
    }
}
