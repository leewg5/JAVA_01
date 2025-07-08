package day07;

public class ParkingLot {
    public int calculateFee(int minutes) {
        if (minutes <= 30) return 1000;

        int extra = (int) Math.ceil((minutes - 30) / 10.0);
        int fee = 1000 + extra * 500;

        return Math.min(fee, 20000);
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        System.out.println(lot.calculateFee(65));
        System.out.println(lot.calculateFee(140));
    }
}