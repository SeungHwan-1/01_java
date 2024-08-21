package main.java.com.ohgiraffers.understand;

public enum Grade {
    FRASHMAN ("1학년"),
    SOPHOMORE("2학년"),
    JUNIOR("3학년"),
    SENIOR("4학년");
    private final String description;

    Grade (String description) { // 뒤에 description을 쓰려면 생성자와 이게 필요하다
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
