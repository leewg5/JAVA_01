package 종합.종합과제5.model.dto;

public class WaitingDto {

    private String phone;
    private int count;


    // 2. 생성자
    public WaitingDto() {}
    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }
    // 3. 메소드

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}

/*
2. 클래스 설계 (총 4개)
        1) WaitingDto.java (model.dto 패키지)
            · private 멤버 변수: phone(문자열), count(정수)
        · 모든 멤버 변수를 초기화하는 생성자를 정의합니다.
        · 각 멤버 변수에 대한 public Getter와 Setter 메소드를 정의합니다.
*/