package section05.typecasting;

public class Question {
    public static void main(String[] args) {

        /*
        *  5명의 반 학생이 있으며 키는 각각
        *  178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        *  우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
        *  소수자리는 절삭한다.
        *
        * */

        double totalTall = 178.5 + 170.3 + 190.7 + 188.67 + 160.8;
        int tall = (int)(totalTall /5);
        System.out.println(tall);
        // ---------------------------------------------

        long lnum = 10L;
        int num =  190;

        int sum = (int)lnum + num;
        int sum2 = (int)(num + lnum);

        System.out.println(sum + sum2);


        System.out.println("------------------------------");

        /*
        *  사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다.
        *
        *  매출은 다음과 같다.
        *  150400원
        *  1400원
        *  25000원
        *  30000원
        * 총합 - 이번 달 매출
        *
        *  다음과 같이 출력 해주세요
        *  홍길동의 총 매출은 --원 입니다.
        *  부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        * */

    }
}
