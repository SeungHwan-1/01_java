package main.java.com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application04 {
    public static void main(String[] args) {
        /*
        Stack
        stack은 리스트 계열 클래스의 Vector클래스를 상속받아
        구현되어있다.
        스택 메모리 구조는 선형메모리 공간에 데이터를 저장하며
        후입선출LIFO방식의 자료구조라 불린다.


         */

        Stack<Integer> Instack = new Stack<>();

        //push() : 값을 넣을 때 이용하는 메소드
        Instack.push(1);
        Instack.push(2);
        Instack.push(3);
        Instack.push(4);
        Instack.push(5);

        System.out.println(Instack);

        //search 스택에서 요소찾는 매소드 위에서부터 순번
        System.out.println(Instack.search(5));
        /*
        peek() 해당 스택의 가장 상단에 있는 요소 반환
        pop() 해당 스택의 가장 상단에 있는 요소 반환 후 제거
         */
        System.out.println("peek(): " + Instack.peek());
        System.out.println("peek(): " + Instack.peek());
        System.out.println(Instack);
        System.out.println("pop() : "+Instack.pop());
        System.out.println("pop() : "+Instack.pop());
        System.out.println("pop() : "+Instack.pop());
        System.out.println("pop() : "+Instack.pop());
        System.out.println(Instack);
    }
}
