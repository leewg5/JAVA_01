package day08;

public class Pet{
    // 멤버 변수
    public String name;
    public String species;
    public int age;

    public Pet(){}
    // 생성자
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // 프로필 출력 메서드
    public void printProfile() {
        System.out.println("이름: " + name);
        System.out.println("종: " + species);
        System.out.println("나이: " + age + "살");
        System.out.println(); // 줄바꿈
    }
}