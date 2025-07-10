package day08;

public class Television {
    // 멤버 변수
    int channel;
    int volume;

    // 생성자
    public Television(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    // 객체 정보 출력용 메서드
    public void printInfo() {
        System.out.println("현재 채널: " + channel);
        System.out.println("현재 볼륨: " + volume);
    }
}