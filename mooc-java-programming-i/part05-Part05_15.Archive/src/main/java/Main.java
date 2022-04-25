
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        while (true) {
            String inputIdentifier;
            String inputName;
            System.out.println("Identifier? (empty will stop)");
            inputIdentifier = scanner.nextLine();
            if (inputIdentifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            inputName = scanner.nextLine();
            if (inputName.equals("")) {
                break;
            }
            Item newItem = new Item(inputIdentifier, inputName);

            if (!archive.contains(newItem)) {
                archive.add(newItem);
            }
        }
        System.out.println("");
        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item);
        }

        scanner.close();
    }
}
