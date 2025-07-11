package 종합.예제7;

//(역할) 프로그램 시작 클래스

import 종합.예제7.view.BoardView;

public class AppStart {
    public static void main(String[] args) {

        //[ boardview index() 호출하는 방법 ]
        //1.메소드가 static이면
        //BoardView.index();
        //2.메소드가 static이 아니면
        //BoardView view = new BoardView();
        //view.index();
        //3. 해당 클래스가 싱글톤이면
        //BoardView 싱글톤 = BoardView.getInstance().index();
        BoardView.getInstance().index();
        // 유재석.밥먹기().공부하기();
        // 유재석은 밥먹고 밥먹은 유재석이 공부



    }
}
