package day14;

class 자동차{
    타이어 tire; //멤버변수
    void run(){
        this.tire.roll();} // 메소드

    }


class 한국타이어 implements 타이어 {
    @Override
    public void roll() {
        System.out.println("[한국]타이어가 회전(구현)");
    }
}


class 금호타이어 implements 타이어 {
    //추상메소드 자동완성 : (방법1) ctrl+스페이스바
    @Override
    public void roll() {
        System.out.println("[금호]타이어가 회전(구현)");

    }
}


public class Example4 {
    public static void main(String[] args) {

        자동차 myCar = new 자동차();
        //myCar.run(); // 오류발생

        //인터페이스 생성자가 없다. // 인터페이스로 객체생성 불가능
        //myCar.tire = new 타이어();

        // [1] 구현체
        myCar.tire = new 한국타이어();
        myCar.run(); //한국타이어가 회전(구현)

        myCar.tire = new 금호타이어();
        myCar.run(); //금호타이어가 회전(구현)

        // tire 멤버변수는 Tire 타입인데 왜? 한국타이어/금호타이어 타입이 대입될까?
        // implements 구현관계라서 가능. 또는 속성이라서
        // - 한국타이어와 금호타이어는 타이어 타입을 구현 했기 떄문에

        System.out.println(myCar.tire instanceof 타이어); //true
        System.out.println(myCar.tire instanceof 금호타이어); //true
        System.out.println(myCar.tire instanceof 한국타이어); //fulse
    } //main end
} //class end

//인터페이스랑 상속관계 다시 복습하기