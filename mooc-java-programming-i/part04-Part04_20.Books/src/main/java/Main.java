import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String inputTitle;
        int inputPages;
        int inputPublicationYear;

        while (true) {
            System.out.print("Title: ");
            inputTitle = scanner.nextLine();
            if (inputTitle.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            inputPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            inputPublicationYear = Integer.valueOf(scanner.nextLine());
            library.add(new Book(inputTitle, inputPages, inputPublicationYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String decision = scanner.nextLine();
        if (decision.equals("everything")) {
            for (Book book : library) {
                System.out.println(book);
            }
        }
        if (decision.equals("name")) {
            for (Book book : library) {
                System.out.println(book.getName());
            }
        }
        scanner.close();

    }
}
