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
        this.id = rand.nextInt(1000);
    }

    public void Loan(){
        setAvailable(false);
    }

    public void Refund(){
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

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void Lend(Integer id){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
