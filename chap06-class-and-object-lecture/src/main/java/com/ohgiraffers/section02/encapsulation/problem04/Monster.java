package main.java.com.ohgiraffers.section02.encapsulation.problem04;

public class Monster {
    /*접근제어자
    클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한

    1. public 모든 패키지 접근허용
    2.protected 동일 패키지에 접근 허용 단 상속관계에 있는경우 다른 패키지에서도 접근할 수이 있음
    3. default :동일 패키지에서만 접근허용
    4. private : 해당 클래스 내부에서만 접근허용


    위에 네가지 접근제어자는 클래스의 멤버(필드,메소드) 모두 사용 가능하다.
    단, 클래스 선언시 사용하는 접근제어자는 public과 default만 가능하다.
     */
    private String kind;
    private int ihp;

    public void setKind(String kind) {
        this.kind = kind;
    }
    public void sethp(int hp) {
        if(hp > 0) {
            this.ihp = hp;
        }
        else {
            this.ihp = 0;
        }
    }
    public String getInfo()
    {
        return "몬스터의 종류는" + this.kind + "이고 체력은" +this.ihp + "체력입니다";
    }

}
