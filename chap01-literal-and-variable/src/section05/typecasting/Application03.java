package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        *  자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
        *  다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        *
        * */

        int inum = 10;
        long lnum = 10L;

        System.out.println(inum + lnum);

        long result = inum + lnum;
        int result2 = inum + (int)lnum;
        int result3 = (int)(inum + lnum);

        System.out.println(result + result2 + result3);

        byte bnum = 1;
        short snum = 2;

        int result4 = bnum + snum;
        System.out.println(result4);

        long lnum3 = 3L;
        long result5 = bnum + lnum3;
    }
}
