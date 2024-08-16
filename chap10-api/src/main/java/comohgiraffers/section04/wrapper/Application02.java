package main.java.comohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        // parsing  문자열 값을 기본자료형으로 변경하는 것!!!!

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4"); // 이건좀많이씀
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0f");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");
        System.out.println(l);
    }
}
