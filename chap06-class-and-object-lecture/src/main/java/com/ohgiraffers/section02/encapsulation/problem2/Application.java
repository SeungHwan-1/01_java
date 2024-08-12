package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        //필드에 직접 접근하는 경우 생기는 문제점 2

        Monster CMonster01 = new Monster();
        CMonster01.name = "C 드라큘라";
        CMonster01.iHp = 200;

        Monster CMonster02 = new Monster();
        CMonster02.name = "C 프랑켄";
        CMonster02.iHp = 400;

        Monster CMonster03 = new Monster();
        CMonster03.name = "C 미라";
        CMonster03.iHp = 300;

        System.out.println("mosnter name" + CMonster01.name);
        System.out.println("mosnter name" + CMonster02.name);
        System.out.println("mosnter name" + CMonster03.name);

    }
}
