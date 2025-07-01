package day02;

public class Example1 {

    public static void main(String[] args) {

     //(변수) 타입변환, 캐스팅, 다형성(하나의 자료가 여러개 타입 가질수 있다.)
        //1. 자동 타입변환(묵시적)
        // byte -> short/char -> int -> long -> float -> double


        //2. 강제 타입변환(명시적)
        //double -> float -> long -> int -> short/char -> byte
        double davlue = 3.14;
        float fvalue = (float) davlue;
        long lvalue = (long) fvalue;
        int ivalue = (int) lvalue;
        short svalue = (short) ivalue;
        byte bvalue = (byte) svalue;

        //3. 연산 타입변환
        byte b1 = 10; byte b2 = 20; short s1 = 30; int i1 =40;
        float f1 = 3.14f; double d1 =41.25;
        int result = b1 + b2;
        int result2 = b1 + s1;



    }
}

