package 종합.종합과제9.게시판_프로젝트_예제11.view;

import 종합.종합과제9.게시판_프로젝트_예제11.controller.BoardController;
import 종합.종합과제9.게시판_프로젝트_예제11.model.Dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {

    private Scanner scan = new Scanner(System.in);
    private int item_id;

    private BoardView() {}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance() {
        return instance;
    }

    // 메인 화면
    public void index() {
        try {
            System.out.println("=========================================== 종합과제9 ================================================================================");
            System.out.print("1.중고물품등록 | 2.전체물품목록조회 | 3.물품 정보 수정 | 4.등록 물품 삭제 | 5. 익명 문의 남기기 | 6.물품 상세조회 | 7.등록 랭킹 조회 | 8. 검색조회 선택> ");
            int choose = scan.nextInt();

            switch (choose) {
                case 1 -> boardWrite(item_id);
                case 2 -> boardPrint();
                case 3 -> boardUpdate();
                case 4 -> boardDelete(); // 파라미터 제거
                case 5, 6, 7, 8 -> System.out.println("[안내] 해당 기능은 준비 중입니다.");
                default -> System.out.println("[경고] 존재하지 않는 중고품입니다.");
            }

        } catch (InputMismatchException e) {
            System.out.println("[경고] 잘못된 입력입니다. 다시 입력해주세요.");
            scan.nextLine(); // 버퍼 비우기
        } catch (Exception e) {
            System.out.println("[오류] 관리자에게 문의 <010-9999-9999>");
        }
    }

    // (1) 등록 화면
    public void boardWrite(int item_id) {
        scan.nextLine(); // 버퍼 클리어
        System.out.print("> 판매자 닉네임 : ");
        String seller_nickname = scan.nextLine();
        System.out.print("> 물품명 : ");
        String item_name = scan.nextLine();
        System.out.print("> 물품 설명 : ");
        String description_text = scan.nextLine();
        System.out.print("> 가격 : ");
        int price = scan.nextInt();
        scan.nextLine(); // 숫자 입력 후 개행 문자 제거
        System.out.print("> 비밀번호 입력 : ");
        String password = scan.nextLine();

        // Controller 호출 시 인스턴스를 통해 호출
        boolean result = BoardController.boardWrite(
                seller_nickname, item_name, description_text, price, password,
                item_id);

        if (result) {
            System.out.println("[안내] 중고품 작성 성공");
        } else {
            System.out.println("[실패] 중고품 작성 실패");
        }
    }

    // (2) 전체조회 화면
    public void boardPrint() {
        ArrayList<BoardDto> result = BoardController.boardPrint();
        System.out.println("-----------------------------------------------");
        System.out.println("no \t 판매자 \t 중고 품명");
        System.out.println("-----------------------------------------------");
        for (BoardDto dto : result) {
            System.out.printf("%d \t %s \t %s \n",
                    dto.getItem_id(), dto.getSeller_nickname(), dto.getItem_name());
        }
    }

    // (3) 삭제 화면
    public void boardDelete() {
        System.out.print("삭제할 물품 번호: ");
        int item_id = scan.nextInt();
        boolean result = BoardController.boardDelete(item_id);
        if (result) {
            System.out.println("[안내] 삭제 성공");
        } else {
            System.out.println("[경고] 삭제 실패");
        }
    }

    // (4) 수정 화면
    public void boardUpdate() {
        System.out.print("수정할 물품 번호: ");
        int item_id = scan.nextInt();
        scan.nextLine();
        System.out.print("새 판매자 닉네임: ");
        String seller_nickname = scan.nextLine();
        System.out.print("새 물품 이름: ");
        String item_name = scan.nextLine();

        boolean result = BoardController.boardUpdate(item_id, seller_nickname, item_name);
        if (result) {
            System.out.println("[안내] 중고품 수정 성공");
        } else {
            System.out.println("[경고] 중고품 수정 실패");
        }
    }
}