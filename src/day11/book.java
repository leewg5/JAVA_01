package day11;

public class book {

     private String title;
     private String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
