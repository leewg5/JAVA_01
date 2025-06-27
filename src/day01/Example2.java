package day01;

public class Example2 {  //class start : 모든 자바코드는 클래스안에 작성한다.

    //main 함수 선언 : main + 엔터(자동완성)
    public static void main(String[] args) { // main start
        // (2) 리터럴 : JAVA 언어 들이 미리 정의한 데이터
        // 3, '이', "이원국", 3.14, true == 리터럴   *JS에서는 '작은따옴표와 "큰따옴표 구분이 없다.
        // (3) 출력함수 : system.out.print(리터럴/변수/연산/함수 등);
        // JS : console.log() , * JS에서는 ;(세미클론) 선택이지만, 자바는 무조건 명령어끝에 ; 넣는다.
        // sout + 엔터 == System.out.println(); 
        System.out.println( 3 ); //리터럴 3 출력
        // (4) main함수 실행 : ctrl + shift + f10 또는 실행버튼
        System.out.println(3.14);
        System.out.println('이');
        System.out.println("이원국");
        System.out.println(true);
        // (5) 자료형/타입 , 8가지          *기본 자료형 vs *참조 자료형
        // 정수 : byte, short, int, long
        // 실수 : float, double
        // 문자 : char             문자열 : String
        // 논리 : boolean
        // 리터럴의 모든 정수는 int , 모든 실수는 double
        // (6) 리터럴 값을 변수(*한개만 저장 가능한*)에 대입하기
        // 1. boolean 타입 : true 와 false만 저장
        boolean bool1 = true; // 리터럴 true를 저장 가능한 타입
        boolean bool2 = false; //
        // boolean bool3 = 3; // 3이라는 리터럴은 boolean에 저장 불가능.
        System.out.println(bool1); // 변수명을 호출하여 변수값 출력.
        System.out.println(bool2);
            // 2. char 타입 : '작은따옴표 으로 감싼 문자1개 저장
        char ch1 ='A';
            //char ch2 = 'ABC'; // 불가능. 문자여러개(문자열)
            //char ch3 = "ABC"; // " " 감싼 자료도 불가능
        System.out.println(ch1);
            // 3. String 클래스타입 : "큰따옴표 으로 감싼 문자 여러개 저장;
        String str1 = "ABC";
        // String str2 = 'ABC';   // ' '감싼 자료는 불가능
        System.out.println(str1);

        // 4. byte 타입 : 정수 -128 ~ +127   1바이트
        byte b1 = 100;
        //byte b2 = 300; //불가능, 저장 허용 범위 벗어남.
        System.out.println(b1);


        // 5. short 타입 : 정수 +-3만정도     2바이트
        short s1 =32000;
        // short s2 = 50000; //불가능 저장 허용 범위 벗어남.
        System.out.println(s1);


        // 6. int 타입 : 정수 +-21억정도      4바이트, 정수 리터럴*
        int i1 = 210000000;
        //int i2 = 300000000; // 불가능 : 저장 허용 범위 벗어남.
        System.out.println(i1);


        // 7. long 타입 : 정수 +-21억이상     8바이트, 리터럴뒤에 L/l  ex) 123456L
        long l1 = 300000000L;
        long l2 = 300000000l;
        System.out.println(l1);
        System.out.println(l2);

        // 8. double 타입 : 실수 소수점17자리 까지 표현, 실수 리터럴*
        double d1 = 0.123124414124421;
        System.out.println(d1);

        // 9. float 타입 : 실수 소수점 8자리까지 표현, 리터럴뒤에 F/f
        float f1 = 0.12343245345345345f;
        float f2 = 0.123253455534535353F;
        System.out.println(f1);
        System.out.println(f2);

        // ********** 주의할점 : double 과 Double 은 각각 다름. **********//

    } // main end
} // class end
