
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositive = 0;
        int numberOfPositive = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sumOfPositive += input;
                numberOfPositive++;
            }
        }
        if (sumOfPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfPositive / numberOfPositive);
        }
        scanner.close();
    }
}
