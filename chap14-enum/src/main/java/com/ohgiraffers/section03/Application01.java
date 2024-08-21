package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getRole());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.name() + "  " + consumer.getDescription());


        //
        System.out.println(consumer == UserRole2.CONSUMER);
        System.out.println("=======================");
        //EnumSet을 통해 여러 열거형을 타입들을 set으로 취급할수있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> it = roles.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().name());
        }

        //특정타입만 골라서 set에 추가할 수있다.
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER,UserRole2.PRODUCER);
        Iterator<UserRole2> it2 = users.iterator();
        while (it2.hasNext()) {
            UserRole2 u = it2.next();
            System.out.println(u.name()+ " " + u.getDescription());
        }
    }
}
