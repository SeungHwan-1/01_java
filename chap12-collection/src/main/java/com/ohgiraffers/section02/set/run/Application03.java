package main.java.com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args) {
        /*
        TreeSet
        데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소 저장
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작
        시간이 매우 빠르다.
        Set 인터페이스의 특징을 그대로 가지지만 정렬된 상태를
        유지한다는 것이 다름점이다.
        -자동 오름차순 정렬
         */
        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println(tset);

        //목록을 만들어서 하나씩 대문자로 변경해 출력처리를 해줄거에요.

        Iterator<String> iterator = tset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toUpperCase()); // iter.next 스트링 오브젝트 거기다가 어퍼케이스를함
        }
        Object[] arr = tset.toArray();

        for(Object o : arr)
        {
            System.out.println(((String)o).toUpperCase()); //부모는 자식을 못써서 다운케스팅 해줘야함
        }

        //로또 번호 발생.

        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 5)
        {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println(lotto);
    }
}
