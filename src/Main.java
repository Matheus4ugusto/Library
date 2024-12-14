import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Boolean active = true;
    static Integer choice = 0;

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the library");
        System.out.println("Please select an option below");
        Boot();
    }

    public static void Boot(){
        Scanner scan = new Scanner(System.in);

        List<Book> books = new ArrayList<>();



        while (active){
            System.out.println("Press 1 to loan a book");
            System.out.println("Press 2 to refund a book");
            System.out.println("Press 3 to register an new book");
            System.out.println("Press 4 to exit");

            try {
                choice = scan.nextInt();
                scan.nextLine();
            }catch (Exception e){
                System.out.println("Please, enter a valid number");
                Boot();
            }
            if(choice == 1){

                System.out.println("Please, select a book to loan");
                for (int i = 0; i < books.size(); i++) {
                    Book actualBook = books.get(i);
                    if(actualBook.getAvailable()) {
                        System.out.printf("%d %s, by %s%n", i, actualBook.getTitle(), actualBook.getAuthor());
                    }
                }
                int bookChosen = scan.nextInt();
                books.get(bookChosen).lend();
            }
            if(choice == 2){
                System.out.println("Please, select a book to refund");
                for (int i = 0; i < books.size(); i++) {
                    Book actualBook = books.get(i);
                    if(!actualBook.getAvailable()) {
                        System.out.printf("%d %s, by %s%n", i, actualBook.getTitle(), actualBook.getAuthor());
                    }
                }
                int bookChosen = scan.nextInt();
                books.get(bookChosen).refund();
            }
            if(choice == 3){
                String bookName;
                String authorName;

                System.out.println("Please, enter the name of the book");
                bookName = scan.nextLine();

                System.out.println("Please, enter the name of the author");
                authorName = scan.nextLine();

                System.out.printf("The book %s by %s has been successfully registered!%n", bookName, authorName);

                Book book = new Book(bookName, authorName);
                books.add(book);
            }
            if (choice == 4){
                active = false;
            }
        }
    }
}