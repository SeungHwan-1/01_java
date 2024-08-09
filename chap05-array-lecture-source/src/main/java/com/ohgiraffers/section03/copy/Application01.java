package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {
        /*
        배열의 복사는 크게 두종류
        얕은 복사 주소값만 복사
        깊은 복사 heap영역의 값을 복사


        stack 에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다
        하나의 래퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을
        수정하게 되면 다른 래퍼런스 변수의 배열에 접근했을 때도 동일한 배열을
        가리키고 있기 떄문에 변경된 값이 반영되어있다.!!
         */

        int[] iarr = {1,2,3,4,5};
        int[] iarrCopy = iarr;
        System.out.println(iarr.hashCode());
        System.out.println(iarrCopy.hashCode());

        for(int x : iarr)
            System.out.println(x);

        for(int y : iarrCopy)
            System.out.println(y);

        iarrCopy[0] = 99;

        for(int x : iarr)
            System.out.print(x);
        System.out.println();
        for(int y : iarrCopy)
            System.out.print(y);

    }
}
