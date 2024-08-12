package main.java.com.ohgiraffers.section06.parameter;

public class parameterTest {
    public void testPtP(int num)
    {
        System.out.println("매개변수로 전달 받은 값 :"+num);
    }
    public void testPTAP(int[] iarr)
    {
        System.out.println("매개변수로 전달 받은 값 :"+ iarr);
        System.out.println("배열의 값 출력 :");
        for(int i = 0; i < iarr.length; i++)
        {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        for(int i = 0; i < iarr.length; i++)
        {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
    }
    public void TestClassTpye(rectangle rect)
    {
        /*
        인스턴스 주소가 전달된다.
        즉 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는
        서로 동일한 인스턴스를 가리킨다.(얇복)

         */

        System.out.println("매개변수로 전달 받은 값" + rect);

        System.out.println("변경 전 사각형의 넓이와 둘레 ======");
        rect.calcArea();
        rect.calcRound();
        System.out.println("변경후 ===========");
        rect.setHeight(100);
        rect.setWidth(100);
        rect.calcArea();
        rect.calcRound();

    }
    public void TestleghtArrayParameter(String name,String... hobby){
        /*
        안줘도되고 몇개있는지 모를때 String...을 사용함(가변형매개변수
         */
        System.out.println("이름 : "+ name);
        System.out.println("취미의갯수 : "+ hobby.length);
        System.out.println("취미 : ");
        for(String s : hobby)
        {
            System.out.println(s + " ");
        }
        System.out.println();
    }

}
