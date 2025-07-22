package 종합.종합과제7.model.dto;

public class ArrayListdto {

    private String content;
    private String writer;

    public ArrayListdto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "ArrayListdto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
