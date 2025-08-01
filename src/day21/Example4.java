package day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {

    public static void main(String[] args) {

        /*
        [스레드풀]
            1. 정의 : 미리 일정 개수의 스레드를 생성하고 필요에 따라 재사용하는 방식
            2. 목적 : 작업이 들어올때 마다 새로운 스레드가 아닌 기존 스레드 이용한다.
            3. 효과 : 스레드 재사용, 자원 효율, 과부하 방지 등등
            4. 구조 : 작업의 요청을 '큐'라는 자료구조로 배치하여 순서대로 스레드 풀엣 대기중인 스레드에게 작업배정
            * 큐? 자료의 데이터들을 요청 순서대로 처리방법
            =================================
            input [요청3][요청2][요청1] output
            =================================
            5. 생활속예시 : 콜센터 , 유재석이 콜센터에 전화 하면 대기중인 직원1(스레드)가 존재하면 처리 아니면 대기

                           [스레드풀]
            콜요청------------->  직원1,2,3 스레드  // Dao = JBDC

            6. 사용처 : 1) 톰캣[자바웹클래스] 2) JDBC 3) 업로드/다운로드 4) 채팅(카톡)
            7. 사용법


         */
        //[1] 작업스레드를 배정하기
        //ExecutorService executorService = Executors.newFixedThreadPool(스레드풀에 저장할 스레드 수)
        ExecutorService executorService = Executors.newFixedThreadPool(3); //직원수 3명 = 스레드 3개씩 처리

        //[2] 반복문을 이용하여 각각 3개 스레드를 생성하여 스레드풀에 넣어주기
        for(int i = 1; i<=100; i++){
            String name = "Thread" + i;
            //[3] 스레드 생성, 익명 구현체
            Runnable runnable = new Runnable(){
                @Override
                public void run() {
                    try{Thread.sleep(2000);}
                    catch (Exception e){}
                    System.out.println("Task Thread? :" + name);

                }
            };
            //[4] 생성된 스레드를 스레드풀에 넣어주기/등록한다
            executorService.submit(runnable);
        }
    }
}
