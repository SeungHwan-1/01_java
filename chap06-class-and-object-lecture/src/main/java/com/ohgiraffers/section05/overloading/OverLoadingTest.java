package main.java.com.ohgiraffers.section05.overloading;

public class OverLoadingTest {
    public static void main(String[] args) {

    }
    //오버로딩에 대해 이해 할 수 있다.!
    /*
    오버로딩의 사용이유
    매개변수의 종류별로 메소드 내용을 다르게 작성해야하는 경우가 잇다
    이때 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리가어려움
    규모가작으면 괜찮지만 커질수록힘들다
    메소드 또한 관리하기가 매우어렵다 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야하는
    메소드를 관리하기 위해 사용하는 기술을 오버로딩이라고ㅓ한다.

     */
    /*
    오버로딩 조건
    동일한 이름을 가진 메소드의 파라미터선언부에 매개변수의 타입 갯수 순서를

     다르게 작성하여 한클래스내에 동일하 ㄴ이름의 메소드를 여러개 작성할수잇도록한다

     메소드의 시그니쳐가 다르면 다른 메소드로 인식하기 때문이다.
     즉, 시그니쳐중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야
     오버로딩이 성립된다

     시그니쳐 메소드의 메소드명과 파라미터 선언부 부분
     public void method(int num){} method(int num) 부분

     */

    public void test(int a){

    }
    public void test(int a, int b){

    }
    public void test(boolean a){

    }
    public void test(double a){

    }
    public void test(String[] a){

    }
    public void test(char a){

    }
}
