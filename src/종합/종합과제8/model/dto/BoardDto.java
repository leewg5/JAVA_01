package 종합.종합과제8.model.dto;

public class BoardDto {

    //1. 멤버변수: private 사용과 db테이블 속성과 일치화
    private int cno;
    private String cphone; // 연락처
    private int cpop; // 인원수

    public BoardDto(int cno, String cphone, int cpop) {
        this.cno = cno;
        this.cphone = cphone;
        this.cpop = cpop;
    }

    public BoardDto() {
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public int getCpop() {
        return cpop;
    }

    public void setCpop(int cpop) {
        this.cpop = cpop;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "cno=" + cno +
                ", cphone='" + cphone + '\'' +
                ", cpop=" + cpop +
                '}';
    }
}
