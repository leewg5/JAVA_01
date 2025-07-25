package 종합.종합과제9.게시판_프로젝트_예제11.model.Dto;

public class BoardDto {
    private int item_id;  // 등록 시 생략 가능
    private String seller_nickname;
    private String item_name;
    private String description_text;
    private int price;
    private String password;
    private boolean is_sold; // 수정 등에서 활용, 기본 false

    // 생성자 만들기
    public BoardDto(int item_id, String seller_nickname, String item_name) {
        this.item_id = this.item_id;
        this.seller_nickname = this.seller_nickname;
        this.item_name = this.item_name;
        this.description_text = description_text;
        this.price = price;
        this.password = password;
        this.is_sold = is_sold;
    }

    // get and set 구성 만들기
    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getSeller_nickname() {
        return seller_nickname;
    }

    public void setSeller_nickname(String seller_nickname) {
        this.seller_nickname = seller_nickname;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getDescription_text() {
        return description_text;
    }

    public void setDescription_text(String description_text) {
        this.description_text = description_text;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_sold() {
        return is_sold;
    }

    public void setIs_sold(boolean is_sold) {
        this.is_sold = is_sold;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "item_id=" + item_id +
                ", seller_nickname='" + seller_nickname + '\'' +
                ", item_name='" + item_name + '\'' +
                ", description_text='" + description_text + '\'' +
                ", price=" + price +
                ", password='" + password + '\'' +
                ", is_sold=" + is_sold +
                '}';
    }
}