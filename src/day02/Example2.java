package day02;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

            //String 변수명

            // Scanner scan = new Scanner(System.in); 집중!!
            //입력함수 : 콘솔화면에서 키보드로부터 입력받은 방법
            // 1. new Scanner(System.in); : 시스템(컴퓨터)로 부터 입력관련 기능(함수) 제공하는 객체

            // [1] Scanner객체로 부터 .next() 함수 호출
            //new Scanner(System.in).next();

            // [2] Scanner 객체를 변수에 저장하여 재활용
            Scanner scan = new Scanner(System.in);
            // 1. next()
            System.out.printf("1. next(): ");
            String a = scan.next();
            System.out.println("1. next result :" + a);

            //2. nextLine()


            //3. nextByte();
        System.out.println("3. nextByte():");
        scan.nextByte();
        System.out.println("3. nextByte()");

            // 4. nextShort();
        System.out.println("4. nextShort():");
        short value2 = scan.nextShort();
        System.out.println("4. nextShout():"+ value2);


            // 5. nextInt();
        System.out.println("5. nextInt():");
        int value3 = scan.nextInt();
        System.out.println("5. nextInt() result :" + value3);

        //6. nextLong(); : 입력받은 정수(long)반환, 입력받은 long 허용범위 벗어나면 오류
        System.out.println("6. nextLong():");
        long value4 = scan.nextLong();
        System.out.println("6. nextLong() result :" + value4);

        //7. nextFloat(); 입력받은 실수(Float)반환, 입력값이 float 허용범위 벗어나면 오류
        System.out.println("7. nextFloat():");
        float value5 = scan.nextFloat();
        System.out.println("7. nextFloat():"+ value5);

        //8. nextDouble(): 입력받은 실수(double) 반환, 입력값이 double 허용범위 벗어나면 오류
        System.out.println("8. nextDouble():");
        double value6 = scan.nextDouble();
        System.out.println("8. nextDouble():" + value6);

        //9. nextBoolean()
        System.out.println("9. nextBoolean");
        boolean value7 = scan.nextBoolean();
        System.out.println("9. nextBoolean():"+ value7);

    }
}
