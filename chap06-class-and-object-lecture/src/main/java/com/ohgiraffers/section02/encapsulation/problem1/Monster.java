package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int ihp;


    public void setHp(int hp) {
        if (hp > 0) {
            System.out.println("입력되어 몬승터의 체려ㅛㄱ을 입력한 값으로 변경합니다 ");

        ihp = hp;
        /*
        this는 인스턴스가 생성되엇을 때 사진의 주소를 저장하는 레퍼런스 변수이다
        지역변수와 전역변수의 이름이 동일한 경우
         */}
    else
        {
            System.out.println("0보다 작거나 같은 값이 입력되어 0으로 설정합니다");
            ihp = 0;
        }
    }


}
