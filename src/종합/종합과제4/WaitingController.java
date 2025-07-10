package 종합.종합과제4;

//종합과제4
public class WaitingController {
    // 1. 대기 명단 배열 (정적, 최대 100명 저장)
    private static final Waiting[] Waitings = new Waiting[100];

    // 2. 대기 등록 메소드
    public static boolean addWaiting(String phone, int count) {
        Waiting newWaiting = new Waiting(phone, count);

        // 배열에서 빈 칸(null)을 찾아 등록
        for (int i = 0; i < Waitings.length; i++) {
            if (Waitings[i] == null) {
                Waitings[i] = newWaiting;
                return true; // 등록 성공
            }
        }
        return false; // 빈 공간이 없을 경우 등록 실패
    }

    // 3. 대기 명단 조회 메소드
    public static Waiting[] getWaitingList() {
        return Waitings;
    }
}