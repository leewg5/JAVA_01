package 종합.종합과제8;

import 종합.종합과제8.controller.BoardController;
import 종합.종합과제8.model.dto.BoardDto;
import 종합.종합과제8.view.BoardView;

import java.util.ArrayList;

public class AppStart {


    public static void main(String[] args) {
        // * 메인화면 호출
        BoardView.getInstance().index();


        // 1. 20250723_1 등록 테스트
        boolean result = BoardController.getInstance().boardWrite( "010-55",3);
        System.out.println(result);

        // 2. 20250723_1 전체조회 테스트
        ArrayList<BoardDto> result2 = BoardController.getInstance().boardPrint();
        System.out.println(result2);

        // 3. 20250723_1 취소 테스트 , 삭제가 성공하면 true 실패or존재하지않으면 false

        boolean result3 = BoardController.getInstance().boardDelete();
        System.out.println(result3);


        // * 메인화면 호출
        BoardView.getInstance().index();
        }
    }


