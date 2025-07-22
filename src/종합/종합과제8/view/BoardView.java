package 종합.종합과제8.view;


import 종합.종합과제8.controller.BoardController;
import 종합.종합과제8.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {

    private int cpop;
    private int cno;
    private String cphone;

    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }

    //(*) 모든 메소드가 사용 가능하도록 메소드밖에 입력객체 생성
    private Scanner scan = new Scanner(System.in);
    // (*) BoardController 싱글톤 불러오기
    private BoardController boardController = BoardController.getInstance();
    
    // (*) 메인 화면
    public void index() {
        for ( ; ; ) {
            try {
                System.out.println("============= 종합과제8 =============");
                System.out.print("1.대기번호 등록 2.대기현황 전제조회 3.대기 취소 4.대기정보 수정  선택> ");
                int choose = scan.nextInt();
                if (choose == 1) {
                    boardWrite();
                } else if (choose == 2) {
                    boardPrint();
                } else if (choose == 3) {
                    boardUpdate(cpop);
                } else if (choose == 4) {
                } else {
                    System.out.println("[경고] 존재하지 않는 대기번호 입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[경고] 대기번호가 일치 하지 않습니다.<다시입력>");
                scan = new Scanner(System.in); // * 입력에 따른 입력객체 초기화 : 잘못된 데이터 지우기
            } catch (Exception e) {
                System.out.println("[오류] 관리자에게 문의 <010-8888-8888> ");
            }
        }
    }

    // (1) 등록 화면 구현
    public void boardWrite() {
        // 1. 입력받기
        scan.nextLine();
        System.out.print("> 전화번호 : ");
        String cphone = scan.nextLine(); // nextLine() : 띄어쓰기 가능 , 앞에 의미없는 .nextLine() 필요하다.
        System.out.print("> 인원수 : ");
        int cpop = scan.nextInt();// next() : 띄어쓰기 불가능
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardWrite(cphone, cpop);
        // 4. 리턴된 값 에 따른 출력하기
        if (result) {
            System.out.println("[안내] 전화번호와 인원수 작성 성공 ");
        } else {
            System.out.println("[실패] 전화번호와 인원수 작성 실패 ");
        }
    } // func end

    // (2) 전체조회 화면 구현
    public void boardPrint() {
        // 1. controller 에게 요청후 결과 받기
        ArrayList<종합.종합과제8.model.dto.BoardDto> result = boardController.boardPrint();
        // 2. 결과에 따른 화면 구현
        System.out.println("-----------------------------------------------");
        System.out.println("no \t 전화번호 \t 인원수"); // 표 상단(헤더)
        System.out.println("-----------------------------------------------");
        for (BoardDto dto : result) { // 향상된 for문 , for( 타입 변수명 : 리스트명 ){ }
            System.out.printf("%d \t %s \t %s \n",  // 표 내용물
                    dto.getCno(), dto.getCphone(), dto.getCpop());
        } // for end
    }

    public void boardDelete(){
        //1.입력받기
        System.out.println("취소할 대기번호:");
        int cno = scan.nextInt();
        //2. controller 전달하기 //3. 전달후(결과)리턴값 저장하기
        boolean result = boardController.boardDelete();
        //4. 리턴된 값에 따른 출력하기
        if (result) {
            System.out.println("[안내]대기번호 삭제 성공");
        } else {
            System.out.println("[경고]대기번호가 없는 번호이거나 실패");
        }
    }

    //(4) 수정 화면 구현
    public void boardUpdate(int cpop) {
        // 1. 입력받기
        System.out.println("취소할 대기번호:");
        int cno = scan.nextInt();
        scan.nextLine();
        System.out.println("취소할 대기내용:");
        String bcontent = scan.nextLine();
       
        boolean result = boardController.boardUpdate(cno, cphone, cpop);
        // 4. 리턴된 값에 따른 출력하기
        if (result) {
            System.out.println("[안내]대기번호 수정 성공");
        } else {
            System.out.println("[경고]없는 번호이거나 대기번호 수정 실패");
        }
    } // class end
}