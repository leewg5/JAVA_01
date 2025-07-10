package day08;

public class Book {

    // 멤버 변수
    String title;
    String author;
    int price;

    // 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 객체 정보 출력용 메서드
    public void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println(); // 줄바꿈
    }
}
