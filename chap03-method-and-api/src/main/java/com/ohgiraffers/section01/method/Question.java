package main.java.com.ohgiraffers.section01.method;

public class Question {
    public static void main(String[] args) {

        /*
        *  만들어보자
        *  두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        *  두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 뺀 값을 반환하는 메소드
        *  두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        *  두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드
        * */
        int first = 10;
        int second = 5;

        Question app7 = new Question();
        System.out.println(app7.app1(first,second));

    }

    public int app1(int a, int b){
        int a1 = a + b;
        return a1;
    }
    public int app2(int a, int b){
        int a2 = a - b ;
        return a2;
    }
    public int app3(int a , int b){
        int a3 = a * b;
        return a3;
    }
    public int app4(int a ,int b){
        int a4 = a / b;
        return a4;
    }
}
