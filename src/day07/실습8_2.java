package day07;

public class ParkingLot {
    public int calculateFee(int minutes) {
        int fee = 1000; // 기본 요금

        if (minutes > 30) {
            int extraMinutes = minutes - 30;
            int extraUnits = (int) Math.ceil(extraMinutes / 10.0);
            fee += extraUnits * 500;
        }

        // 일일 최대 요금 적용
        return Math.min(fee, 20000);
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        System.out.println("65분 요금: " + lot.calculateFee(65) + "원");   // 출력: 3500원
        System.out.println("140분 요금: " + lot.calculateFee(140) + "원"); // 출력: 7000원
    }
}