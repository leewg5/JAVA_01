package 종합.종합과제6.controller;
import 종합.종합과제6.model.dao.ArrayListDao;
import 종합.종합과제6.model.dto.ArrayListDto;
import java.util.ArrayList;

public class ArrayListController {

    // DAO 호출
    private static ArrayListDao dao = ArrayListDao.getInstance();

    // View에서 넘겨받은 int 값을 String으로 바꿔서 DAO로 넘김
    public static boolean addArrayList(String phone, int peopleCount) {
        return dao.addArrayList(phone, String.valueOf(peopleCount));
    }

    public static ArrayList<ArrayListDto> getArrayList() {
        return dao.getArrayList();
    }
}

/*
[JAVA] 종합과제6 : 식당 대기번호 프로그램 ( ArrayList  ) * boardService8 참고하시오.
        [ 목표 ] 종합과제6 요구사항 동일 , 배열 대신에 ArrayList 구현하기
[ 실행 예시 ]
        =========== 맛집 대기 시스템 ===========
        1.대기 등록 | 2.대기 현황
========================================
선택 > 1
전화번호 : 010-1234-5678
인원수 : 2
        [안내] 대기 등록이 완료되었습니다.

=========== 맛집 대기 시스템 ===========
        1.대기 등록 | 2.대기 현황
========================================
선택 > 1
전화번호 : 010-8765-4321
인원수 : 4
        [안내] 대기 등록이 완료되었습니다.

=========== 맛집 대기 시스템 ===========
        1.대기 등록 | 2.대기 현황
========================================
선택 > 2
        ============= 대기 현황 =============
        1. 연락처: 010-1234-5678 - 인원: 2명
------------------------------------
        2. 연락처: 010-8765-4321 - 인원: 4명
------------------------------------
*/
