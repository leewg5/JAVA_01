package 종합.종합과제5.model.dao;

import 종합.종합과제5.model.dto.WaitingDto;

public class WaitingDao {

    private WaitingDao() {
    }

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    private static final WaitingDto[] waitingDB = new WaitingDto[100];


    public boolean addWaiting(String phone, int count) {
        boolean result = false;
        WaitingDto waitingDto = new WaitingDto(phone, count);
        for (int i = 0; i < waitingDB.length; i++) {
            if (waitingDB[i] == null) {
                waitingDB[i] = waitingDto;
                result = true;
                break;
            }
        }
        return result;
    }

    public WaitingDto[] getWaitingList() {
        return waitingDB;
    }
}

/*
2) WaitingDao.java (model.dao 패키지)
            · 싱글톤 패턴으로 구현합니다.
            · private static final WaitingDto[] waitings = new WaitingDto[100]; 를 멤버 변수로 가집니다.
        · 대기 등록(WaitingDto를 배열에 저장), 대기 현황 조회(배열 반환) 등 데이터에 직접 접근하는 모든 로직을 메소드로 구현합니다.

 */