import java.util.Random;

public class Book {
    String title, author;
    Boolean available;
    Integer id;

    Random rand = new Random();

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void lend(){
        setAvailable(false);
    }

    public void refund(){
        setAvailable(true);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    private void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
