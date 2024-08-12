package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false;

    private int ispeed;

    //시동 걸기 -시동이 걸려있는 상태의 경우는 할일이 없고,
    //걸려있지 않은 상태인 경우 시동을 건다.
    public void startUp()
    {
        if(isOn)
        {
            System.out.println("Car is on시동이 걸었져있음");
        }
        else
        {
            System.out.println("Car is on시동을 걸었음");
            this.isOn = true;
        }
    }
    // 시동이 걸린 상태에서만 호출시마다 속도를 10씩 증가시킴;
    public void go()
    {
        if(isOn)
        {
            if(ispeed == 0)
            {
                System.out.println("자동차가 출발합니다");
            }
            ispeed += 10;
            System.out.println("자동차의 시속은 평균" + ispeed + "km/h 입니다");
        }
        else
        {
            System.out.println("시동을 걸어야 출발이 가능 합니다.");
        }
    }
    public void stop(){
        if(isOn)
        {
            if (this.ispeed > 0)
            {
                while(this.ispeed > 0)
                {
                    --this.ispeed;
                    System.out.println("현재속도" + this.ispeed + "km/h");
                }
            }
            System.out.println("자동차가 멈췄습니다");
        }
        else
        {
            System.out.println("시동을 걸지않은경우 유압으로인해" +
                    "브레이크가 점점 무거워 집니다.");
        }
    }
    public void thrunOff()
    {
        if(isOn) {
            if (this.ispeed > 0) {
                System.out.println("달리는 상태에서 시동을 끄는 것은 위험합니다.");
            } else {
                this.isOn= false;
                System.out.println("시동을 끄겠습니다.");
            }
        }
        else
        {
            System.out.println("이미 시동이 꺼져있습니다.");
        }
    }


}
