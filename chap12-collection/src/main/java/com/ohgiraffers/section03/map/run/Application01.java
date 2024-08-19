package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {



        /*
        * map
        * collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키와 값을 한 쌍으로 저장하는 방식을 사용한다.
        * 인덱스 대신에 키 사용
        *
        * 카(key)?
        * 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1.요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 즁복값을 저장가능하다.
        *
        * HashMap,HashTable, TreeMap 등의 대표적인 클래스가 있지만,
        * HashMap이 가장 많이 사용된다.!
        *
        *


        */
        HashMap hMap = new HashMap(); //앞에키 뒤에가 벨류. //오토박싱이되는것
        hMap.put("one", new Date());
        hMap.put(2,"redApple");
        hMap.put(3.3,123);
        System.out.println(hMap);

        hMap.put(2,"yello");
        System.out.println(hMap);

        hMap.put(3,"yello");
        System.out.println(hMap);

        //값을 가져올 때 get();
        System.out.println("key 3 value        " +hMap.get(3));

        /*
        userName : hong
        userId user01

        username yuu
        userId user02
         */

        //카 값 삭제 처리 remove()
        hMap.remove(3);
        System.out.println(hMap);

        System.out.println(hMap.size());

        HashMap<String,String> hMap2 = new HashMap();
        hMap2.put("one","java17");
        hMap2.put("two","mysql");
        hMap2.put("three","jdbc");
        hMap2.put("four","html");
        hMap2.put("five","css3");

        //keySet() 이용해서 키만 따로 set으로 만들고, iterator()로
        //키에 대한 목록을 만든다.
        Iterator<String> it = hMap2.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = hMap2.get(key);
            System.out.println(key+":"+value);
        }
        //
        Collection<String> values = hMap2.values();

        Iterator<String> valuesiter = values.iterator();

        while(valuesiter.hasNext()) {
            String value = valuesiter.next();
            System.out.println(value);
        }
        Object[] values2 = hMap2.values().toArray();
        for(int i=0;i <values2.length;i++ )
        {
            System.out.println(values2[i]);
        }

        //Map의 내부에 존재하는 EntrySet을 이용 entry - key +values 묶음.ㄹㅇ
        Set<Map.Entry<String,String>> entrySet = hMap2.entrySet();
        Iterator<Map.Entry<String,String>> entrySetiter = entrySet.iterator();

        while(entrySetiter.hasNext()) {
            Map.Entry<String,String> entry = entrySetiter.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
