package main.java.com.ohgiraffers.section06.parameter;

public class rectangle {
    private double width;
    private double height;

    public rectangle() {

    }

    public rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void calcArea()
    {
        double area = width * height;
        System.out.println("Area is: " + area);
    }
    public void calcRound()
    {
        double round = (width+height) * 2;
        System.out.println("Round is: " + round);
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
