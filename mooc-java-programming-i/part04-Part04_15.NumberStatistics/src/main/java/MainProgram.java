
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber;
        Statistics userNumbers = new Statistics();
        Statistics userEvenNumbers = new Statistics();
        Statistics userOddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                break;
            }

            if (inputNumber % 2 == 0) {
                userEvenNumbers.addNumber(inputNumber);
            } else {
                userOddNumbers.addNumber(inputNumber);
            }
            userNumbers.addNumber(inputNumber);
        }

        System.out.println("Sum: " + userNumbers.sum());
        System.out.println("Sum of even numbers: " + userEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + userOddNumbers.sum());
        scanner.close();
    }
}
