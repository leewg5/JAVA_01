package day21;

// (1) 유저1 클래스 [작업스레드1]
class User1 extends Thread{
    public Calculator calculator;
    @Override public void run() {
        calculator.setMemory( 100 );
    }
} //class end
// (2) 유저 클래스 [작업스레드2]
class User2 extends Thread{
    public Calculator calculator;
    @Override  public void run() {
        calculator.setMemory( 200 );
    }
} // class end
// (3) 계산기 클래스 [ 객체 ]
class Calculator{
    public int memory; // 멤버변수
    public synchronized void setMemory( int memory ){
        this.memory = memory; // 매개변수 대입
        try{ Thread.sleep( 2000 ); }
        catch ( Exception e ){}
        System.out.println( this.memory );
    }
} // class end
public class Example3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        user1.calculator = calculator;
        User2 user2 = new User2();
        user2.calculator = calculator;
        // 3. 두 스레드 실행
        user1.start();
        user2.start();
    } // main end
} // clalss end