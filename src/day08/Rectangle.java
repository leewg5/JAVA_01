package day08;


public class Rectangle {
    // 멤버 변수
    private int width;
    private int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 넓이 계산 메서드
    public int getArea() {
        return width * height;
    }
}