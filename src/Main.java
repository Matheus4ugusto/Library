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



        while (active){
            System.out.println("Press 1 to loan a book");
            System.out.println("Press 2 to refund a book");
            System.out.println("Press 3 to register an new book");
            System.out.println("Press 4 to exit");

            try {
                choice = scan.nextInt();
            }catch (Exception e){
                System.out.println("Please, enter a valid number");
                Boot();
            }
            if(choice == 1){

            }
            if(choice == 2){

            }
            if(choice == 3){
                String bookName;
                String authorName;

                System.out.println("Please, enter the name of the book");
                bookName = scan.nextLine();

                System.out.println("Please, enter the name of the author");
                authorName = scan.nextLine();

                System.out.println(bookName + authorName);


            }
            if (choice == 4){
                active = false;
            }
        }
    }
}