package 종합.종합과제6.model.dao;

import 종합.종합과제6.model.dto.ArrayListDto;
import java.util.ArrayList;

public class ArrayListDao {
    // 1) 싱글톤 패턴
    private ArrayListDao(){}
    private static final ArrayListDao instance = new ArrayListDao();
    public static ArrayListDao getInstance(){
        return instance;
    }

    // 2) 데이터 저장용 리스트
    private ArrayList<ArrayListDto> ArrayListDB = new ArrayList<>();

    // 3) 등록 기능
    // 전화번호는 String, 인원수는 int 로 받도록 변경
    public boolean addArrayList(String phone, String peopleCount) {
        boolean result = false;
        // DTO 객체 생성
        ArrayListDto dto = new ArrayListDto(phone, peopleCount);

        // 리스트에 저장
        result = ArrayListDB.add(dto);

        return result;
    }

    // 4) 전체 리스트 반환
    public ArrayList<ArrayListDto> getArrayList() {
        return ArrayListDB;
    }
}