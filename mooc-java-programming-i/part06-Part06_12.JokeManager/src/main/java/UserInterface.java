import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }
            processCommand(input);
        }

    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            add();
        }
        if (command.equals("2")) {
            draw();
        }
        if (command.equals("3")) {
            print();
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.manager.addJoke(joke);
    }

    public void draw() {
        System.out.println(this.manager.drawJoke());
    }

    public void print() {
        this.manager.printJokes();
    }
}
