package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {
        //순차정렬
        int[] iarr = {6,5,4,3,2,1};

        for(int i = 0 ; i < iarr.length ; i++){

            for(int j = 0; j < i;++j)
            {
                if(iarr[i]<iarr[j])
                {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] =temp;

                }
            }

        }
        for(int i = 0 ; i < iarr.length ; i++){
            System.out.print(iarr[i]+" ");
        }


    }
}
