package main.java.com.ohgiraffers.section01.extend;

public class fireCar extends Car {


    public fireCar()
    {
        super(); // 모든 생성자는 이걸 만듬 부모의 생성자를 호출함 자동으로 들어가있어요
    }

    @Override
    public void soundHorn() { // 반환값이랑 접근제어자 같아야됨 아님 오류
        if(isRunning())
        {
            System.out.println("빠아아아아앙");
        }
        else
        {
            System.out.println("소방차가 멈춰있습니다.");
        }
        //return 0;
    }
    public void sprayWater()
    {
        System.out.println("하이드로 펌프!");
    }
}
