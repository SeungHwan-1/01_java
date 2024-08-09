package main.java.com.ohgiraffers.section04.sort;

public class Application {
    public static void main(String[] args) {
        /*
        변수와 배열의 값을 바꾸는 방법
        변수의 두값 변경하기
       */
        int inum1 =10;
        int inum2 =20;

        int itemp = 0;

        itemp = inum1;
        inum1 = inum2;
        inum2 = itemp;

        System.out.println(inum1);
        System.out.println(inum2);

        //배열의 인덱스 값 서로 변경하기
        int[] iarr = {2,1,3};

        int temp2;
        temp2 = iarr[0];
        iarr[0] =iarr[1];
        iarr[1] = temp2;

        for(int i =0 ; i < iarr.length ; i++){
            System.out.println(iarr[i]);
        }
    }

}
