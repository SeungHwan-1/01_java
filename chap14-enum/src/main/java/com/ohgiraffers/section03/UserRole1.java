package main.java.com.ohgiraffers.section03;

import java.util.EnumMap;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN, getRole;

    public String getRole() {
        return this.name().toLowerCase();
    }
}
//EnumM은 상수 하나하나가 인스턴스화 딘다.
//enum타입은