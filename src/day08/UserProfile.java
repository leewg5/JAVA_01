package day08;

public class UserProfile {
    // 멤버 변수
    String name;
    int age;
    String mbti;

    // 생성자
    public UserProfile(String name, int age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }

    // 정보 출력 메서드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("MBTI: " + mbti);
    }
}