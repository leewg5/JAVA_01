package 종합.종합과제7.view;


import 종합.종합과제7.Controller.ArrayListController;
import 종합.종합과제7.model.dto.ArrayListdto;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListView {

    // 1) 싱글톤
    private Scanner scan = new Scanner(System.in);
    private static final ArrayListView instance = new ArrayListView();
    public static ArrayListView getInstance() {
        return instance;
    }

    // 3) 등록 입출력 구현
    public void addArrayList(){
        System.out.println("전화번호: ");
        String phone = scan.nextLine();

        System.out.println("인원수: ");
        int peopleCount = 0;

        // 인원수 입력 오류 방지를 위해 예외처리 권장
        try{
            peopleCount = Integer.parseInt(scan.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("[경고] 인원수는 숫자로 입력해주세요.");
            return;
        }

        boolean result = ArrayListController.addArrayList(phone, peopleCount);
        if (result) {
            System.out.println("[안내] 대기 등록이 완료되었습니다.");
        } else {
            System.out.println("[경고] 대기 등록이 실패하였습니다.");
        }
    }

    // 4) 전체조회 입출력 구현
    public void getArrayList() {
        System.out.println("=========== 맛집 대기 시스템 ===========");
        ArrayList<ArrayListdto> result = ArrayListController.getArrayList();

        for (int i = 0; i < result.size(); i++) {
            ArrayListdto arrays = result.get(i);
            //System.out.println("선택 : " + arrays.getS());
            System.out.println("전화번호 : " + arrays.getContent());
            System.out.println("인원수 : " + arrays.getWriter());
            System.out.println("------------------------------------");
        }
    }

    public void index() {
        for (; ; ) {
            System.out.println("============= 맛집 대기 시스템 =============");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            scan.nextLine();  // 개행 문자 제거

            if (choose == 1) {
                addArrayList();
            } else if (choose == 2) {
                getArrayList();
            }
        }
    }
}
