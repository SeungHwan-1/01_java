package section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        *  김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        *  각각 직책은 대리/ 과장/ 차장/ 부장 이며,
        *  대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        *  보너스는 각 월급 * 0.5 만큼을 주어야 한다.
        *
        *
        *  화면에 다음과 같이 출력되게 해주세요
        *  ex) 김대리의 월급은 100만원 + 보너스 50 만원으로 총 150만원 입금 되었습니다.
        * 
        *  4명 다 출력
        * */

        int a = (int)(100 * 0.5);

        int cost1 = 100;
        int cost2 = 120;
        int cost3 = 130;
        int cost4 = 150;
        int bonus1 = (int)(cost1*0.5);
        int bonus2 = (int)(cost2*0.5);
        int bonus3 = (int)(cost3*0.5);
        int bonus4 = (int)(cost4*0.5);

        System.out.println("김대리의 월급은 " + cost1 + "만원 + 보너스 " + bonus1 + "만원으로 총 "
            + (cost1+bonus1) + "만원 입금 되었습니다."
        );

        System.out.println("김대리의 월급은 " + cost1 + "만원 + 보너스 " + (cost1/2) + "만원으로 총 "
                + (cost1+cost1/2) + "만원 입금 되었습니다."
        );

        String cost1st = "김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.";

        System.out.println(cost1st);
    }
}
