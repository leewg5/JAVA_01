// 한줄 주석
/*
    여러줄 주석
 */

package day01; //패키지(폴더) 현재 .JAVA 파일이 위치한 패키지명

public class Example1 {
        int a = 10; // 변수 a 선언
        //System.out.print(a); // 출력함수 실행

    public static void main(String[] args) {  //함수 정의
        int b = 20;  // 변수 b 선언
        System.out.print(b); //출력함수 실행
    } //main end

} // class end

// 자바는 클래스 단위로 컴파일(번역)되고, 컴파일된 코드는 main함수부터 읽어서(스레드) 처리한다.
