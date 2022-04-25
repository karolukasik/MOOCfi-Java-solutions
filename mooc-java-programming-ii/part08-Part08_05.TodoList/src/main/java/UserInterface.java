import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner reader;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.reader = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = reader.nextLine();

            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.print("To add: ");
                list.add(reader.nextLine());
            } else if (input.equals("list")) {
                list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                list.remove(Integer.valueOf(reader.nextLine()));
            }

        }
    }
}
