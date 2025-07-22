package 종합.종합과제7.model.dao;


import 종합.종합과제7.model.dto.ArrayListdto;

import java.util.ArrayList;

public class ArrayListdao<A> {
    // 싱글톤
    public ArrayListdao(){}
    private static final ArrayListdao instance = new ArrayListdao();
    public static ArrayListdao getInstance(){
        return instance;
    }

    // (2) (*) DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    private ArrayList<ArrayListdto> ArrayListDB = new ArrayList<>();

    // (3) 데이터 저장용 리스트
    public boolean addArrayList(String phone, String peopleCount){
        boolean result = false;

        // DTO 객체 생성
        ArrayListdto dto = new ArrayListdto(phone, peopleCount);

        // 리스트에 저장
        result = ArrayListDB.add(dto);

        return result;

    }

    //(4) 전체 리스트 반환
    public ArrayList<ArrayListdto>getArrayList(){
        return ArrayListDB;
    }

}
