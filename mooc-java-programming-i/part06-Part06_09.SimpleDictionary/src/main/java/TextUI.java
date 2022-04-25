import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            String command;
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            processCommand(command);
        }

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String searched = scanner.nextLine();
        if (this.dictionary.translate(searched) == null) {
            System.out.println("Word " + searched + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(searched));
        }
    }
}
