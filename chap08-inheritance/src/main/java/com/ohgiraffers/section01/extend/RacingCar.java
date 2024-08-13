package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car {


    public RacingCar() {

    }

    @Override
    public void run() {
       System.out.println("Racing Car질주");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울릴 수 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춤니다");
    }
}
