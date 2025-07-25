package 종합.종합과제9.게시판_프로젝트_예제11.model.Dao;

import 종합.종합과제9.게시판_프로젝트_예제11.model.Dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {

    private BoardDao() {
        connect();
    }

    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance() {
        return instance;
    }

    // (*) DB 연동
    private String db_url = "jdbc:mysql://localhost:3306/items";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;

    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_user, db_password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //(1) 등록 기능 구현
    public boolean boardWrite(BoardDto boardDto) {
        try {
            String sql = "INSERT INTO item (item_id, seller_nickname, item_name, description, price, password, created_at, is_sold) VALUES (? , ? , ? , ? , ? , ? , ?);"; // 1. SQL을 작성한다.
            PreparedStatement ps = conn.prepareStatement(sql); // 2. SQL을 기재한다.
            //3. SQL 매게변수 대입
            ps.setInt(0, boardDto.getItem_id());
            ps.setString(1, boardDto.getSeller_nickname()); // 닉네임 값 대입
            ps.setString(2, boardDto.getItem_name());       // 물품명 값 대입
            ps.setString(3, boardDto.getDescription_text()); // 상세설명 값 대입
            ps.setInt(4, boardDto.getPrice()); //물품 설명 값 대입
            ps.setString(5, boardDto.getPassword()); // 비밀번호 값 대입
            //4. SQL 실행 , insert/update/delete = .executeUpdate();
            int count = ps.executeUpdate();
            //5. SQL 결과에 따른 로직/리턴/확인
            if (count >= 1) return true; // 1개 이상 insert 했으면 저장성공
            return false; // 1개이상 insert 못하면 저장 실패
        } catch (Exception e) {
            System.out.println(e);
        }
        return false; // 예외 발생시 저장실패
    }

    //(2) 전체조회 기능 구현
    public ArrayList<BoardDto> boardPrint() {
        // public : 다른 패키지의 Controller가 접근하기 위해 public 씀
        ArrayList<BoardDto> list = new ArrayList<>();
        try {
            String sql = "select * from item"; //1. SQL 작성(전체조회)
            PreparedStatement ps = conn.prepareStatement(sql); //2. SQL 기재
            //3. SQL 매개변수 대입, SQL문법에 ?(매개변수가 없어서 생략
            ResultSet rs = ps.executeQuery(); //4. SQL 실행, select = executeQuery()
            //5. SQL 결과에 따른 로직/리턴/확인
            // 1) select 조회 결과를 레코드/행/가로단위 하나씩 조회
            while (rs.next()) {
                // 2) 현재 조회중인 레코드의 속성값 호출해서 dto 만들기
                int item_id = rs.getInt("item_id");
                String seller_nickname = rs.getString("seller_nickname"); //rs.get타입 가져올 번호
                String item_name = rs.getString("item_name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                String password = rs.getString("password");
                BoardDto boardDto = new BoardDto(item_id, seller_nickname, item_name);
                // 3) 생성된 dto를 리스트에 담아주기
                list.add(boardDto);
            }// while 반복문 종료
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    // (4) 수정 기능 구현
    public boolean boardUpdate(BoardDto boardDto) {
        try {
            String sql = "update item set seller_nickname = ? where item_id = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getSeller_nickname());
            ps.setString(2, boardDto.getItem_name());
            //4. SQL 실행
            int count = ps.executeUpdate();
            //5. SQL 결과에 따른 로직/리턴/확인
            if (count == 1) return true;
            return false;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    // (3) 삭제 기능 구현
    public boolean boardDelete(int item_id) {
        try {
            //int item_id : 매개변수이면서 삭제할 게시물의 식별(pk)번호
            String sql = "delete from item where item_id = ?"; //1. SQL 작성
            PreparedStatement ps = conn.prepareStatement(sql); //2. SQL 기재
            ps.setInt(1, item_id); // SQL문법내 첫번째 ? 의 INT타입으로 item_id 값 대입 // 3. SQL 매개변수 대입
            // 4. SQL 실횅
            int count = ps.executeUpdate();
            //5. SQL 결과에 따른 로직/리턴/확인
            if (count == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) { System.out.println(e); }
        return false; // <--- 예외발생시 삭제 실패
    }

}

