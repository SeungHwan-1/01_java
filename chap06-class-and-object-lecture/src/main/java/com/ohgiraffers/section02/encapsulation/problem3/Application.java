package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        Monster Cmonster01 = new Monster();
        Cmonster01.SetInfo("드라큘라");
        Cmonster01.SetHp(100);

        Monster Cmonster02 = new Monster();
        Cmonster02.SetInfo("프랑켄");
        Cmonster02.SetHp(200);

        System.out.println(Cmonster01.getInfo());
        System.out.println(Cmonster02.getInfo());

        Monster Cmonster03 = new Monster();
        Cmonster03.name = "두치";
        Cmonster03.iHp = -300;

        System.out.println(Cmonster03.getInfo());
        System.out.println(Cmonster03.getInfo());
    }
}
