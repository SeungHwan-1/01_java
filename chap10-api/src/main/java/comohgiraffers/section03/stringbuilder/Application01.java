package main.java.comohgiraffers.section03.stringbuilder;

public class Application01 {
    public static void main(String[] args) {
        /*
        두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        Stringbuilder 스레드 동기화 기능 제공하지않음
        스레드 동기화 처리를 고려하지 않은 상황에서 Stringbuffer 보다
        성능이 좋음
        StringBuffer 스레드 동기화 기능 제공함
        성능면에서는 Stringbuilder 보다느림
        두개의 차이는 스레드 동기화 유무일 뿐이구 우리 스레드를
        고려하지 않기 때문에 Stringbuilder 를 이용요할 것이다.
         */
        /*
        String : 불변이라는 특징을 가지고 있다.
        문자열에 + 연산으로 합치는 경우 , 기존 인스턴스를 수정하는 것이 아닌
        새로운 인스턴스를 반환한다
        따라서 문자열변경이 자주일어나는 경우 성능 면에서 좋지 않다.
        하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
        Stringbuilder 가변이라는 특징을 가지고 있다
        문자열에 append()메소드를 이용하여 합치기 하는 경우
        기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
        따라서 잦은 문자열 변경이 일어나는 경우에는 String보다 성능이 좋다.
         */

        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);
        System.out.println("sb.hashCOde()" + sb.hashCode());

        sb.append("oracle");
        System.out.println(sb);
        System.out.println("sb.hashCOde()" + sb.hashCode());
    }
}