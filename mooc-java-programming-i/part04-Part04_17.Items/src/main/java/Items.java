
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Name: ");
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            items.add(new Item(userInput));
        }

        System.out.println("");
        for (Item item : items) {
            System.out.println(item);
        }

        scanner.close();
    }
}
