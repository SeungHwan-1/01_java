package main.java.com.ohgiraffers.section03.dto;

public class MemberDTO {
    private String name; //이름
    private int age;//회원 나이
    private int number; //회원번호
    private char gender;//회원 성별
    private double weight;//몸무개
    private boolean isActived;//활동상태 //탈퇴 이런거하면 유저정보를 false로만듬

    /*
    setter ,getter 의경우 실무에서 암묵적으로 토용되는 규칙
    setter작성 규칙
    필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    호출 당시 전다로디는 매개변수의 값을 이용하여 필드의 값을 변경한다.

    getter 작성 규칙
    필드의 값을 반환 받을 목적의 메소드 집합을 의미한다.
    각접근자는 하나의 필드에만 접근하도록 한다.
    필드에 접근해서 기록된 값을 return으로 반환
    이때 반환타입은 자료형과 일치함
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActived() {
        return isActived;
    }

    public void setActived(boolean actived) {
        isActived = actived;
    }
}
