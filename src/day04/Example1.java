package day04;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        /*
            [반복문]
            for(초기값 ; 조건문 ; 증감식){
                실행문;
            }

            - 초기값 : 반복문에서 사용되는 변수 *주로 반복횟수 , int i = 1;
            - 조건문 : 반복변수의 조건문 *주로 반복횟수제한  , i <= 10;
            - 증감식 : 반복변수의 증가(감소)변화식
            - 실행문 : 조건 충족시 실행되는 코드/명령어;

            4. for중첩가능 : 상위 for문이 1회전 마다 하위 for문의 전체 회전
                for(){
                    for(){}
                }
            5. 주요 키워드 :
                1) break; : 가장 가까운 반복문{} 종료/탈출
                2) continue : 가장 가까운 반복문(증감식) 이동

            6. 무한루프(무한반복)
                1) for( ; ; ){}
                2) while(true){}

*/
        //기본 반복문
        for(int i = 1; i<=5; i++){
                System.out.println(i);
        }

        //[2] 중첩 : 구구단
        //단 반복: 2부터 9까지 1씩 증가
        for(int 단 =2; 단<=9; 단++){
            System.out.println(단);
        }
        //곱 반복: 1부터 9까지 1씩증가
        for(int 곱 =1; 곱<=9; 곱++){
            System.out.println(곱);
        }

        //합치기 : (1) 단 마다 곱(2x1 2x2 ~) (2) 곱 마다 단(2x1 3x1 ~)
        for(int 단=2; 단<=9; 단++){
            for(int 곱 = 1; 곱<=9; 곱++){
                System.out.printf("%d x %d = %d\n", 단, 곱, 단*곱);
            }
        }

        //[3] break : 1부터 10까지 출력, 만약에 5를 찾았으면 반복문 종료
        for(int index = 1; index <= 10; index++){
            System.out.println(index);
            if(index == 5){break;} //만약에 index가 5이면 가장 가까운 반복문 종료
            System.out.println(index);
        }

        //[4] continue : 1부터 10까지 반복, 만약에 5를 찾았으면 출력 생략
        for(int index =1; index <= 10; index++){
            if(index == 5){continue;}  // 만약에 현재 index가 5이면 가장 가까운 반복문(증감식)으로 이동
            System.out.println(index);
        }

        //[5] for( ; ; ){} : 무한반복
            for( ; ; ){
            //while(true){
                System.out.println("무한입력[종료:'X']:");
                String input = new Scanner(System.in).next(); //키보드로부터 입력받아 저장
                if(input.equals("x")){break;} // 만약에 입력한 문자열이 "x" 이면 반복문 탈출, 무한루프 종료
        }


    }
}
