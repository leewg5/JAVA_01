package 종합.종합과제4;

//종합과제4
public class Waiting {
    //1. 멤버 변수 선언(private)
    public String phone;
    public int count;


    //마우스 오른쪽 클릭해서 ---> 생성 ---> getter/setter 생성
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
        return "Waiting{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}