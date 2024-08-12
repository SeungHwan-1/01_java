package main.java.com.ohgiraffers.section02.encapsulation.problem04;

public class Application {
    public static void main(String[] args) {
        Monster CMonster01 = new Monster();
        CMonster01.setKind("드라큘라");
        CMonster01.sethp(200);
        System.out.println(CMonster01.getInfo());

        //
      //  CMonster01.kind = "프랑켄";

    }
}
