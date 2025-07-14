package 종합.종합과제6.model.dto;

public class ArrayListDto {


    private String i;
    private String t;

    public ArrayListDto(String i, String t) {
        this.i = i;
        this.t = t;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ArrayListDto{" +
                "i='" + i + '\'' +
                ", t='" + t + '\'' +
                '}';
    }
}