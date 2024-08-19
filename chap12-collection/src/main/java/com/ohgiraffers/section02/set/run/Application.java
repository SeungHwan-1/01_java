package main.java.com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {


        /*
        Set 인터페이스를 구현한 Set컬렉션 클래스
        -단점
        1. 요소의 저장 순서를 유지하지 않는다.
        2. 같은 요소의 중복 저장을 허용하지 않는다.

        -장점 :고유성 보장, 효율적인 데이터 테스트, 수학적 집합 연산 가능
              list에서 중복 제거 가능
         */

        /*
        hashSet
        set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다!!
        해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        값을 기준으로 중복저장이되지않는다

         */

        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String("mysql"));
        hset.add(new String("css"));
        hset.add("java");
        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.contains("java"));
        System.out.println(hset.contains(new String("java"))); //동등객체면 같은걸로본다

        // 1. toArray()이용해 배열로 바꿈
        Object[] arr = hset.toArray(); // 반환 타입이 오브젝트로 되어있어서 받아줘야함이걸로만.
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //2. iterator()로 목록을 만든다.배열로 만들어서 처리하거나 반복자
        Iterator<String> it = hset.iterator(); //이터레이터타입

        while(it.hasNext())
        {
            System.out.println(it.next());


        }

        System.out.println(it.hasNext()); // 빼면 없어져서 재사용불가함 해즈넥스트있나없나 확인함

        System.out.println(hset);

        hset.clear();
        System.out.println(hset.isEmpty());


    }
}
