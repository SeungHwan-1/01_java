package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean running;

    public Car() {
        System.out.println("Car Constructor");
    }
    public void run()
    {
        running = true;
    }
    public void soundHorn()
    {
        if(isRunning())
        {
            System.out.println("빵빵");
        }
        else
        {
            System.out.println("주행중이아님");
        }
    }
    public boolean isRunning() {
        return running;
    }
    public void stop()
    {
        running = false;
        System.out.println("차가멈춰요");
    }
}
