package day08;

public class Player {
    // 멤버 변수
    String name;
    int power;
    int speed;

    // 생성자
    public Player(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    // 객체 정보 출력용 메서드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("파워: " + power);
        System.out.println("스피드: " + speed);
        System.out.println(); // 줄 바꿈
    }
}