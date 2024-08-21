package main.java.com.ohgiraffers.section03;

public enum UserRole2 {

    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");
    private final String description;

    UserRole2 (String description) { // 뒤에 description을 쓰려면 생성자와 이게 필요하다
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
