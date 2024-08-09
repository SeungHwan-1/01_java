package main.java.com.ohgiraffers.section02.arry;

public class Application01 {
    public static void main(String[] args) {
        /*다차원 배열
        다차원 배열은 2차원 이상 배열을 의미한다.
        배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        더 많은 차원의 배열을 사용할 수 있지만, 일반적으로 2차원 배ㅕㅇㄹ보다 높은 차원의 배열은 사용 빈도가 적다
         */
        /*
        2차원 배열 사용밥법
        1.주소를 보관할 수있는 변수선언
        2. 여러 개의 1차원 배열을 주소관리하는 배열을 생성(heap)
        3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
        4. 생성한 여러 개의 1차원 배열에 각 차례로 접근해서 사용
         */
        int[][] arry1;
        int iarr2[][];
        int[] iaary3[];

        //배열의 주소를 관리하는 배열의 길이는 정수형으로 반드시 크기를 지정해 주어야한다.
        arry1 = new int[10][10];//됨
        //  arry1 = new int[][];//안됨
        //  arry1 = new int[][3];//안됨
      /*  arry1[0] = new int[5];
        arry1[1] = new int[5];
        arry1[2] = new int[5];*/ //가변배열

        iarr2 = new int[3][5]; //정변배열

        //0번인덱스 값 출력
 /*       for (int i = 0; i < arry1[0].length; i++) {
            arry1[0][i] = arry1[0][i] + i;
            System.out.print(arry1[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arry1[1].length; i++) {
            arry1[1][i] = arry1[1][i] + i;
            System.out.print(arry1[1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arry1[2].length; i++) {
            arry1[2][i] = arry1[2][i] + i;
            System.out.print(arry1[2][i] + " ");
        }
        System.out.println();
*/

        for (int i = 0; i < arry1.length; i++) {
            for(int j = 0; j < arry1[i].length; j++) {
              arry1[i][j] =i * j;
              System.out.print(arry1[i][j] + " ");
             //   System.out.println();
          }
            System.out.println();

        }


    }
}
