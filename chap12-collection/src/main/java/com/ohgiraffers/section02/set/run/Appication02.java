package main.java.com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Appication02 {
    public static void main(String[] args) {

        /*
        linkedHashSet
        HashSet 이 가지는 기능을 모두 가지고 있고
        추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        -인덱스 접근은 불가

         */

        LinkedHashSet<String> lset = new LinkedHashSet<>();

        lset.add("java");
        lset.add("mysql");
        lset.add("jdbc");
        lset.add("html");
        lset.add("css");
        System.out.println(lset);

    }
}
