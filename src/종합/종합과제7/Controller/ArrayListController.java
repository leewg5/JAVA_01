package 종합.종합과제7.Controller;


import 종합.종합과제7.model.dao.ArrayListdao;
import 종합.종합과제7.model.dto.ArrayListdto;

import java.util.ArrayList;

public class ArrayListController {

    //dao 호출
    private static ArrayListdao dao = ArrayListdao.getInstance();

    //View에서 넘겨받은 int 값을 String으로 바꿔서 DAO로 넘김
    public static boolean addArrayList(String phone, int peopleCount){
        return dao.addArrayList(phone, String.valueOf(peopleCount));
    }

    public static ArrayList<ArrayListdto> getArrayList() {
        return dao.getArrayList();
    }
}


/*
[JAVA] 종합과제7 : 식당 대기번호 프로그램 ( MVC , +CSV  ) * boardService9 참고하시오.

[ 목표 ] 종합과제6 요구사항 동일

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
연락처: 010-1234-5678 - 인원: 2명
------------------------------------
연락처: 010-8765-4321 - 인원: 4명
------------------------------------
 */