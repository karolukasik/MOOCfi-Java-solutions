import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        this.todoList.add(scanner.nextLine());
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed?");
        int indexOfTaskToRemove = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(indexOfTaskToRemove);
    }
}
