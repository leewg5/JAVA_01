package day14;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.PrimitiveIterator;

// 문제1번 기본 상속
class Person{
    String name;  //멤버변수

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}


class Animal{
    void makeSound(){
        System.out.println("동물이 소리를 냅니다.");

    }
}

class Cat extends Animal{ // extends로 상속 진행
     void makeSound(){ //
         System.out.println("고양이가 야옹하고 웁니다.");
     }
}

// 부모 클래스
class Machine{
    public Machine() {  //부모 클래스 생성자 생성하기
        System.out.println("부모 클래스 생성자 실행");
    }
}
// 자식 클래스
class Computer extends Machine{  //컴퓨터 클래스에 상속 진행
    public Computer() { // 자식 클래스도 생성자 생성하기
        System.out.println("자식 클래스 생성자 실행");
    }
}


class Figure { // 클래스 정의

}
class Triangle extends Figure{ // 상속 진횅

}


class Shape{  // 클래스정의
    void draw(){
        System.out.println("도형을 그립니다.");

    }
}
class Circle extends Shape{//상속 진행

    @Override
    void draw() { // 마우스로 매서드 재정의 누름...
        super.draw(); // 마우스로 매서드 재정의 누름...
        System.out.println("원을 그립니다.");
    }
}
//상위클래스
class Vehicle{
    //클래스 정의

}
//하위클래스
class Bus extends Vehicle{ //상속 진행
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}
//상위클래스
class Beverage {
    void drink(){
        System.out.println("음료를 마십니다.");
    }
}
//하위클래스
class Coke extends Beverage{ //상속진행

    @Override
    void drink() {
        super.drink();
        System.out.println("콜라를 마십니다.");
    }
}
class Coffee extends Beverage{
    @Override
    void drink() {
        super.drink();
        System.out.println("커피를 마십니다.");
    }
}
class Weapon{
    void attak(){
        System.out.println("무기로 공격합니다.");
    }
}
class Sword extends Weapon{
    @Override
    void attak() {
        super.attak();
        System.out.println("검으로 공격합니다.");
    }
}
class Gun extends Weapon{
    @Override
    void attak() {
        super.attak();
        System.out.println("총으로 공격합니다.");
    }
}
class Charactor{
    void use(Weapon weapon){
        weapon.attak();
    }
}
class SuperClass{
    String name = "상위";
    void method(){
        System.out.println("상위 메소드");
    }
}
// 하위 클래스
class SubClass extends SuperClass{
    String name = "하위";

    @Override
    void method() {
        super.method();
        System.out.println("하위 메소드");
    }
}

class Device{
    // 상위 클래스 정의
}
class Electronic extends Device {
    // 중간 클래스 정의 , 상속 진행
}
class Laptop extends Electronic {
    // 하위 클래스 정의 , 상속 진행
}




public class 실습12 {
    public static void main(String[] args) {
        // 문제1번 Student 객체 생성
        Student student = new Student("한국", 20250717);
        System.out.println("국적: " + student.getName());
        System.out.println("날짜: " + student.getStudentId());

        // 문제2번 Cat 객체 생성
        Cat cat = new Cat();
        cat.makeSound(); // 재정의된 메서드 호출

        // 문제3번 객체 생성
        Computer com = new Computer();

        // 문제4번 객체 생성
        Triangle triangle = new Triangle();
        Figure figure = triangle; // Triangle은 Figure의 하위클래스이기때문입니다.
        // 즉..하위 클래스에서 상위 클래스로 올라가는 것이 맞다고 생각합니다. 반대는 불가입니다.

        // 문제5번 객체 생성
        Shape shape = new Circle();  // 속성이 구현되서.. 또는 구현체라서입니다.
        shape.draw();   //구현체라고 해서 Circle();값이 shape 로 갑니다. 그래서 출력됩니닷.

        //문제6번 객체 생성
        Vehicle vehicle = new Bus();
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle; // (Bus) 강제변환
            bus.checkFare();
        }

        //문제7번 객체 생성
        Beverage[] drinks = new Beverage[2];
        drinks[0] = new Coke();
        drinks[1] = new Coffee();
        for (Beverage b : drinks) {
            b.drink();
        }

        //문제8번 객체 생성
        Sword sword = new Sword();
        Gun gun = new Gun();
        Charactor charactor = new Charactor();
        charactor.use(sword);
        charactor.use(gun);

        //문제9번 객체 생성
        SuperClass obj = new SubClass(); //이부분은 SubClass();가 하위클래스라서 Obj에 입혀집니다.
        obj.method(); // 이부분은 처음부터 상위 클래스라서 상위로 찍힙니다.

        //문제10번 객체 생성
        Laptop laptop = new Laptop();
        // instanceof로 타입 확인
        System.out.println("laptop instanceof Laptop: " + (laptop instanceof Laptop));         // true
        System.out.println("laptop instanceof Electronic: " + (laptop instanceof Electronic)); // true
        System.out.println("laptop instanceof Device: " + (laptop instanceof Device));         // true


    }
}






/*
[JAVA] 실습12 : 클래스의 상속
[ 문제 ] 아래 클래스 상속 관련 문제를 해결하시오.
        [ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

        [문제 1] 기본 상속
1. name(문자열) 멤버 변수를 가진 Person 클래스를 만드세요.
        2. Person 클래스를 상속받는 Student 클래스를 만드세요. Student 클래스에는 studentId(정수) 멤버 변수를 추가하세요.
        3. main 함수에서 Student 객체를 생성하고, 상속받은 name과 자신의 studentId에 값을 저장한 뒤 모두 출력하세요.

[문제 2] 메소드 오버라이딩 (Method Overriding)
1. "동물이 소리를 냅니다."를 출력하는 makeSound() 메소드를 가진 Animal 클래스를 만드세요.
        2. Animal을 상속받고, makeSound() 메소드를 재정의하여 "고양이가 야옹하고 웁니다."를 출력하는 Cat 클래스를 만드세요.
3. main 함수에서 Cat 객체를 생성하고 makeSound() 메소드를 호출하여, 재정의된 내용이 출력되는지 확인하세요.

        [문제 3] 생성자 호출 순서
1. 생성자에서 "부모 클래스 생성자 실행"을 출력하는 Machine 클래스를 만드세요.
2. Machine을 상속받고, 생성자에서 "자식 클래스 생성자 실행"을 출력하는 Computer 클래스를 만드세요.
3. main 함수에서 Computer 객체를 생성할 때, 콘솔에 출력되는 생성자 호출 순서를 확인하세요.

[문제 4] 다형성: 자동 타입 변환 (Upcasting)
1. Figure 클래스를 만드세요.
2. Figure를 상속받는 Triangle 클래스를 만드세요.
3. main 함수에서 Triangle 객체를 생성하여 Figure 타입의 변수에 저장하는 코드를 작성하고, 이것이 가능한 이유를 주석으로 설명하세요.

[문제 5] 다형성과 오버라이딩
1."도형을 그립니다."를 출력하는 draw() 메소드를 가진 Shape 클래스를 만드세요.
        2.Shape을 상속받고, draw() 메소드를 재정의하여 "원을 그립니다."를 출력하는 Circle 클래스를 만드세요.
3.main 함수에서 Shape shape = new Circle(); 코드를 작성한 뒤, shape.draw()를 호출했을 때 어떤 결과가 나오는지 확인하고 그 이유를 주석으로 설명하세요.

        [문제 6] instanceof와 강제 타입 변환 (Downcasting)
1. Vehicle 클래스와 이를 상속받는 Bus 클래스를 만드세요. Bus 클래스에만 checkFare() 메소드("요금을 확인합니다.")를 추가하세요.
        2. main 함수에서 Vehicle vehicle = new Bus(); 코드를 작성하세요.
        3. if문과 instanceof 연산자를 사용하여 vehicle 변수가 Bus 타입인지 확인하세요.
4. 만약 Bus 타입이 맞다면, Bus 타입으로 강제 변환한 뒤 checkFare() 메소드를 호출하세요.


        [문제 7] 다형성을 활용한 객체 배열
1. "음료를 마십니다."를 출력하는 drink() 메소드를 가진 Beverage 클래스를 만드세요.
        2. Beverage를 상속받는 Coke와 Coffee 클래스를 만들고, 각 클래스에서 drink() 메소드를 오버라이딩하여 "콜라를 마십니다.", "커피를 마십니다."를 출력하도록 하세요.
3. main 함수에서 Beverage 타입의 배열을 생성하고, 그 안에 Coke 객체와 Coffee 객체를 저장하세요.
        4. 반복문을 사용하여 배열의 모든 요소를 꺼내 drink() 메소드를 호출하고, 각기 다른 결과가 출력되는 것을 확인하세요.



        [문제 8] 다형성을 활용한 매개변수
1. Weapon 클래스와 이를 상속받는 Sword, Gun 클래스를 만드세요. 각 클래스는 "무기로 공격합니다.", "검으로 공격합니다.", "총으로 공격합니다."를 출력하는 attack() 메소드를 가집니다. (오버라이딩 활용)
        2. Weapon 타입의 매개변수를 받아 그 객체의 attack() 메소드를 호출하는 Character 클래스와 use(Weapon weapon) 메소드를 만드세요.
        3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른 결과가 출력되는 것을 확인하세요.

        [문제 9] 필드와 메소드의 오버라이딩 차이
1. String name = "상위"; 필드와 method() 메소드("상위 메소드" 출력)를 가진 SuperClass를 만드세요.
        2. SuperClass를 상속받고, String name = "하위"; 필드와 method() 메소드("하위 메소드" 출력)를 가진 SubClass를 만드세요.
        3. SuperClass obj = new SubClass(); 로 객체를 생성한 뒤, obj.name과 obj.method()를 각각 호출했을 때의 결과를 확인하고, 왜 다른 결과가 나오는지 주석으로 설명하세요.

        [문제 10] 다중 상속 관계
1. Device 클래스를 만드세요.
2. Device를 상속받는 Electronic 클래스를 만드세요.
3. Electronic을 상속받는 Laptop 클래스를 만드세요.
4. main 함수에서 Laptop 객체를 생성한 뒤, 이 객체가 Electronic 타입과 Device 타입으로도 형 변환이 가능한지 instanceof 연산자로 확인하고 결과를 출력하세요.
*/
