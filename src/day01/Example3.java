package day01;

import java.sql.SQLOutput;

public class Example3 {

    public static void main(String[] args) {
        /*
           [출력함수]
             System : 시스템 관련 기능 제공하는 클래스
             out : 출력관련 객체 반환
             (1) System.out.print();    : 출력 함수
             (2) System.out.println();  : 출력 후 줄바꿈 함수~~
             (3) System.out.printf();   : f(format) 형식 맞게 출력 함수

            [자동완성]
              System.out.print :  자동완성 없음
              System.out.println : sout + 엔터
              System.out.printf : souf + 엔터
              -- 형식을 넣음 --  System.out.printf("형식", 값);
              %s : 문자열 위치   %c : 문자 위치
              %d : 정수 위치     %f : 실수 위치

             [자릿수 맞춤]
              %자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 오른쪽정렬
              %-자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 왼쪽정렬
              %0자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 0채움

             [소수점 자릿수 맞춤]
              %전체자릿수.소수점자릿수f : (소수점포함)전체 자릿수 만큼 자릿수 차지

             [이스케이프/제어 문자] : 특수문자에 기능이 포함
             \n : 줄바꿈
             \t : 들여쓰기
             \\ : '\' 백슬래시 1개 출력
             \' : ' 작은 따옴표 출력
             \" : " 큰 따옴표 출력


        */
        System.out.println("자바안녕1"); // 자료 출력 후 줄바꿈 처리.
        System.out.println("자바안녕2");

        System.out.print("자바안녕3"); // 자료출력
        System.out.print("자바안녕4");

        System.out.printf("%s", "자바안녕5\n");

        // [2] 변수 선언
        String name = "유재석"; // String(문자열저장) name(변수명) = (대입) "유재석"(자료)
        int age = 40;  // int(정수타입) age(변수명) = (대입) 40(자료) ;(마침)

        System.out.printf("저는 %s 이고 나이는 %d 입니다.\n", name, age);
        //printf("~~~~~~~~~~형식자료 ~~~~~~~~~~~~, 값1, 값2) ==> %s에는 name값 대입, %d에는 age값 대입
        // vs
        System.out.println("저는" + name + "이고 나이는" + age + "입니다.\n");
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name, age); //%6d, 6자릿수안에 정수표현, 오른쪽정렬
        System.out.printf("저는 %s 나이는 %-6d 입니다.\n", name, age); // %-6d, 6자릿수안에 정수표현, 왼쪽정렬
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age); // %06d, 6자릿수안에 정수표현, 빈칸은 0채움
        System.out.printf("저는 %s 이고 신장은 %5.2f 입니다.\n", name, 188.257); // %5.2f, 5자릿수안에 실수 표현, 소수점2개(2칸)

        //[3] 이스케이프 문자
        System.out.println("안녕1\n안녕2");     // \n 줄바꿈 처리
        System.out.println("안녕3\t안녕4");     // \t (tab) 들여쓰기
        System.out.println("안녕5\'안녕6\'");   // 안녕5'안녕6'
        System.out.println("안녕7\"안녕8\"");   // 안녕7"안녕8"
        System.out.println("안녕9\\안녕10\\");  // 안녕9\안녕10\






    }
}
