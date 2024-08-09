package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
        깊은복샤
        heap에 생선된 배열이 가지고 있는 값을
        또다른 배열에 복사하는 것.

        서로 같은 값을 가지고 있지만, 두배열은 서로 다른 배열이기에 하나의 배열을 변경하더라도 다른 배열에는 영향을 주지않은다
        깊은 복사를 하는 방법 4가지
        1.for문을 이용한 동일 인덱스 값 복사
        2.object의 clone을 이용한 복사
        3.System의 arratCopy()를 이용한 복사
        Array의 copyOf()를 이요한 복사

         */
        int[] iOrarr = {1,2,3,4,5};

        DeepCopy(iOrarr);

        // for문을 이용한 동일 인덱스값 복사
        int[] iCopy = new int[10];
        System.out.println("for :"+iCopy.hashCode());
        for(int i = 0; i < iOrarr.length; i++){
            iCopy[i] = iOrarr[i];
            System.out.println(iCopy[i]+ " ");
        }

        //object clone을 이용한 복사 완전같은 배열처럼
        System.out.println("클론 : ");
        int[] iCopy2 = iOrarr.clone();
        DeepCopy(iCopy2);
        //System.arraycopy 카피를이용한 복사
        System.out.println("arrycopy : ");
        int[] iCopy3 = new int[10];
        System.arraycopy(iOrarr, 0,iCopy3,3,iOrarr.length); //0은시작 3번째인덱스부터 집어넣음
        DeepCopy(iCopy3);
        //4. Arrays copyOf() 를 이용한 복사 길이가 자유로움 이거제일많이씀
        System.out.println("CopyOf : ");
        int[] iCopy4 = Arrays.copyOf(iOrarr, 9);
        DeepCopy(iCopy4);

    }

    public static void DeepCopy(int[] iarr)
    {
        System.out.println(iarr.hashCode());
        for(int i = 0; i < iarr.length; i++)
              System.out.println(iarr[i]+ " ");

        System.out.println();
    }
}
