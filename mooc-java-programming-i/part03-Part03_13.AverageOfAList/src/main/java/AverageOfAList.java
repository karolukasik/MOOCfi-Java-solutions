
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("");
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Average: " + (double) sum / numbers.size());
    }
}
