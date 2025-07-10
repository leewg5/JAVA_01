package day08;

public class MenuItem {
    // 멤버 변수
    String name;
    int price;
    boolean isSignature;

    // 생성자
    public MenuItem(String name, int price, boolean isSignature) {
        this.name = name;
        this.price = price;
        this.isSignature = isSignature;
    }

    // 출력 메서드
    public void printInfo() {
        if (isSignature) {
            System.out.println("[대표메뉴] " + name + " : " + price + "원");
        } else {
            System.out.println(name + " : " + price + "원");
        }
    }
}
