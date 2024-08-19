package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {

    /*
     로또 프로그램을 개발 할 것이다.
     우리가 만드는 로또 프로그램은 10번 로또가 판매되면 당첨 번호를 생성하여
     로또 번호를 추첨하여 해당 번호를 가진 사용자에게 상품을 전달하는 방식이다.
     만약 당첨인이 없다면 로또 번호는 재생성이 된다.
     로또 번호는 6자리로 이루어져 있으며 1~45 까지 중복되지 않는 번호를 갖는다.
     여기서 한명의 사용자가 구매할 수 있는 개수는 10개로 10개 이상을 구매할 수 없다.
 ### 예시
     key(String)   value(Set)
      1번 로또   [7, 9, 25, 27, 33, 38]
             ### 결과
     당첨 번호가 있는 경우
     당첨 번호 : [7, 9, 25, 27, 33, 38]
     n로또 당첨 : [7, 9, 25, 27, 33, 38]
     당첨 번호가 없는 경우
     행운 번호 : [7, 9, 25, 27, 33, 38]
     이번 회차 당첨 없음*/
    public static void main(String[] args) {

        HashMap cMap = new HashMap();

        Scanner sc = new Scanner(System.in);





        Set<Integer> lottodang = new TreeSet<>();
        Collection Clist = new ArrayList();
       System.out.println("몇개 살거임? ");
       int K = sc.nextInt();
       int iResult = 0;
        System.out.println("당첨 번호 :");
        while ( lottodang.size() < 5) {
            lottodang.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(lottodang);



        for (int i = 0; i < K; i++) {
            Set<Integer> lotto = new TreeSet<>();

            while ( lotto.size() < 5) {

                lotto.add((int) (Math.random() * 45) + 1);
                // System.out.println(lotto);


            }
            if(lottodang != lotto)
            {
                iResult = 0;
            }
            else
                iResult = 1;
            Clist.add(lotto);
        }
            if(iResult == 0)
                System.out.println("당첨아님");
            else
                System.out.println("당첨");

        cMap.put("One",Clist);
        cMap.put("Two",Clist);
        cMap.put("Three",Clist);
        cMap.put("Four",Clist);
        cMap.put("Five",Clist);
        cMap.put("Six",Clist);
        cMap.put("Seven",Clist);
        cMap.put("Eight",Clist);
        cMap.put("Nine",Clist);
        cMap.put("Ten",Clist);
        System.out.print(Clist);


    }
}
