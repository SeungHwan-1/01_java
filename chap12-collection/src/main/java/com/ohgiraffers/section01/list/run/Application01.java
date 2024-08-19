package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {
        /*
        컬렉션 프레임워크
        자바에서 컬렉션 프레임워크는 여러 개의 다양한
        데이터들을 쉽고 효과적으로 처리할 수 있도록
        표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        즉 데이터를 효율적으로 저장하는 자료구조와 데이터를
        처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다



        Collection은 크게 3가지 인터페이스 중 한 가지를 상속 받아 구현했다
        1.list
        2.set
        3.Map

        list 인터페이스와 Set 인터페이스의 공통 부분을
        Collection 인터페이스에서 정의하고 있다.
        하지만 Map은 구조상의 차이로 정의하고 있지 않다.

        각 인터페이스 별 특징

        1. list 인터페이스
        -순서 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
        Vector Arraylist linkedlist stack queue 등이 있다
        2.Set 인터페이스
        -순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
        hashset,treeset등이 있다.
        3. map 인터페이스
        -키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        -key를 set 방식으로 관리하기 때문에 데이터 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
        hashMap TreeMap HasgTable,Properties 등이 이;ㅆ다.
         */

        /*
        Arraylist
        -가장많이 사용되는 컬렉션 클래스이다.
        -내부적으로 배열을 이용하여 요소를 관리하며
        -인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.

        ArrayList 는 배열의 단점을 보완하기 위해 만들어졌다.
        배열은 크기를 변경할 수 없고, 요소의 추가 , 삭제 , 정렬이
        복잡하다는 단점을 가지고 있다.
        ArrayList는 이런 단점을 보완하고자
        크기변경 요소추가 삭제 정렬 기능을 미리 메소드로 구현해서 제공하고 있다.
        자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.!
        10개단위로 늘어남.!!!!!!!!!2134312
         */

        ArrayList alist = new ArrayList();

        List list =new ArrayList(); //바꿀수있다. 근데 많이 바꾸지않는다
        Collection clist = new ArrayList(); //일케하면 컬렉션안에 set도있기때문에(주고받기)
                                            // 좀더자유롭게사용하긴하는데 잘안씀.
        list.add(1);
        list.add(123);
        list.add(45.67);
        list.add("asdas");               //오브젝트 자손이면 무 슨 타입이든 다넣을수있음.

        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        list.add(3);

        System.out.println(list);

        //원하는 인덱스 위치에 값을 추가할 수도 있음
        list.add(3,4);

        System.out.println(list);

        //remove()
        list.remove(2);
        System.out.println(list);

        //set();
        list.set(1,3);
        System.out.println(list);

        //모든 컬렉션 프레임워크는 제네릭 클래스로 되어있다.
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mellon");

        System.out.println("STRL ="+stringList);

        Collections.sort(list); // collection에서 사용되는 기능들을 static메소드로 구현해 놓은 클래스
        System.out.println(stringList);
    }
}
