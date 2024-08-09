package main.java.com.ohgiraffers.section03.copy;

public class Appliciation02 {
    public static void main(String[] args) {

        String[] names=  {"홍","유","이"};

        System.out.println(names.hashCode());
        Mprint(names);
        //얕은 복사 활용해 매개변수와 리턴값으로 활용해보자

        String[] animals = Getanimal();
        Mprint(animals);
    }
    public static void Mprint(String[] args) {
        System.out.println(args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " " );
        }
        System.out.println();
    }
    public static String[] Getanimal(){
        String[] animals = {"낙","호","나"};
        System.out.println(animals.hashCode());
        return animals;
    }
}
