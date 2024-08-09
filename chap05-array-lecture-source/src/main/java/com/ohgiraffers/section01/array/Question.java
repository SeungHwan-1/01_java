package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        // 트럼프 카드를 랜덤으로 한장 출력해보자

        String[] Sshape = {"Spade", "clover", "hreat", "Dia"};
        String[] Snumber = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int iShapeN = (int) (Math.random() * Sshape.length);
        int iNumberN = (int) (Math.random() * Snumber.length);

        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. (잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "2보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int[] arr = new int[sc.nextInt()];
        int iMaxTemp = 0;
        int itemp = 0;
        for (int i = 0; i < arr.length; ++i) {
            arr[i] += i*Math.random();
            System.out.print(arr[i]);

          //  itemp = arr[i];
        }
        System.out.println();

        for(int i = 0 ; i <arr.length; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[j] < arr[j+1]){
                    iMaxTemp = arr[j + 1];
                    arr[j + 1] = iMaxTemp;
                    itemp = arr[j];
            }



            }

        }
        System.out.println(iMaxTemp);
        System.out.println(itemp);
            /*while(true)
            {
                if (arr[itemp > arr[itemp + 1]) {
                    if (arr.length > arr[itemp + 1])
                        break;
                    itemp = arr[itemp];

                    if (iMaxTemp < itemp) {
                        iMaxTemp = itemp;
                    }
                } else if (arr[itemp] < arr[itemp + 1]) {

                }


            }*/
        }
       // System.out.println(arr[iMaxTemp]);
        //  System.out.println(arr.length);

       /* System.out.println("가장큰값은?");
        int [] arr1 = new int[sc.nextInt()];
        System.out.println(arr1.length);*/


    }

