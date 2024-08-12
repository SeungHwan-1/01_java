package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class  Monster
{
    String name;
    int iHp;

    public void SetInfo(String info)
    {
        name = info;
    }
    public void SetHp(int Hp)
    {
        if(Hp > 0){
            System.out.println("HP is 정상적으로 입력 0");
            this.iHp = Hp;
        }
        else
        {
            System.out.println("HP is 정상적으로 입력 안됨 0으로함");
            this.iHp = 0;
        }
    }

    public String getInfo()
    {
        return "몬스터는" + name + "체력은" +iHp +"입니다";
    }
}
