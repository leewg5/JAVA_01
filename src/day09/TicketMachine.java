package day09;

public class TicketMachine {
    // 1. 멤버변수
    static int totalTickets = 0;
    // 2. 생성자     3. 메소드

    // 2. 인스턴스 메소드 - 티켓 발권
    public void issueTicket() {
        totalTickets++;
        System.out.println("티켓 1장을 발권했습니다.");
    }
    // 3. 정적 메소드 - 총 발권 수 출력
    public static void printTotalTickets() {
        System.out.println("총 발권된 티켓 수: " + totalTickets);
    }
}



/*
        [문제 5] TicketMachine 클래스를 만드세요.
1. 이 클래스 안에, 발권된 총 티켓 수를 저장할 static int totalTickets = 0; 정적 변수를 선언하세요.
2. 티켓을 한 장 발권하는 issueTicket() 인스턴스 메소드를 만드세요. 이 메소드는 호출될 때마다 totalTickets를 1씩 증가시키고, "티켓 1장을 발권했습니다."라고 출력합니다.
        3. 현재까지 발권된 총 티켓 수를 출력하는 static void printTotalTickets() 정적 메소드를 만드세요.
        4. main 함수에서 TicketMachine 객체 3개(machine1, machine2, machine3)를 생성하세요.
        5. machine1으로 티켓 2장, machine2로 티켓 1장을 발권한 뒤, TicketMachine.printTotalTickets()를 호출하여 총 발권 수가 올바르게 나오는지 확인하세요.
*/