package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근하는 경우 발생할 수 있는 문제점 1
        //필드에 올바르지 않은 값이 들어가도 통제가 불가능하다.
        Monster Cmonster1 = new Monster();

        Cmonster1.name = "뿌꾸";
        Cmonster1.ihp = 200;

        System.out.println(Cmonster1.name);
        System.out.println(Cmonster1.ihp);

        Monster Cmonster2 = new Monster();

        Cmonster2.name = "두치";
        Cmonster2.ihp = -200;

        System.out.println(Cmonster2.name);
        System.out.println(Cmonster2.ihp);

        Monster Cmonster3 = new Monster();
        Cmonster3.name = "드라큘라";
        Cmonster3.setHp(200);
        System.out.println(Cmonster3.name);
        System.out.println(Cmonster3.ihp);

        Monster Cmonster4 = new Monster();
        Cmonster4.name = "드큘라";
        Cmonster4.setHp(-200);
        System.out.println(Cmonster4.name);
        System.out.println(Cmonster4.ihp);

    }
}
