
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booksList = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();
            if (inputName.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());
            booksList.add(new Book(inputName, inputAge));
            System.out.println("");
        }
        System.out.println("");
        System.out.println(booksList.size() + " books in total.\n");
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName);

        System.out.println("Books:");
        booksList.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book));
    }

}
