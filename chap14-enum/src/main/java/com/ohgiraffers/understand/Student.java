package main.java.com.ohgiraffers.understand;

public class Student {
    private String name;
    private int iStuNum;
    private int iStugrade;
    private int iScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iStuNum=" + iStuNum +
                ", iStugrade=" + iStugrade +
                ", iScore=" + iScore +
                '}';
    }

    public int getiScore() {
        return iScore;
    }

    public void setiScore(int iScore) {
        this.iScore = iScore;
    }
//private int i

    public Student() {

    }

    public int getiStugrade() {
        return iStugrade;
    }

    public void setiStugrade(int iStugrade) {
        this.iStugrade = iStugrade;
    }

    public int getiStuNum() {
        return iStuNum;
    }

    public void setiStuNum(int iStuNum) {
        this.iStuNum = iStuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
