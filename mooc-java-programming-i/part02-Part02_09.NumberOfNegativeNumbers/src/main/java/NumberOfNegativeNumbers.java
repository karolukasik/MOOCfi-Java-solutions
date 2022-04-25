
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeNumberCounter = 0;
        int number;
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                negativeNumberCounter++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumberCounter);
        scanner.close();
    }
}
