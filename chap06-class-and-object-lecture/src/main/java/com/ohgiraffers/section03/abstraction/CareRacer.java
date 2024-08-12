package main.java.com.ohgiraffers.section03.abstraction;

public class CareRacer {
    /*
    * this.car 의 시동을 거는 메소드
     */
    private final Car Ccar = new Car(); //Ccar 에 접근해서 바꿀수없게끔한다.
    public void startUp()
    {
        Ccar.startUp();
    }
    //cargo를 호출
    public void stepAccelator()
    {
        Ccar.go();
    }
    public void stepBreak()
    {
        Ccar.stop();
    }
    public void turnOff()
    {
        Ccar.thrunOff();
    }

}
