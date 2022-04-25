
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sumOfPositive = 0;
        int number;
        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                counter++;
                sumOfPositive = sumOfPositive + number;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfPositive / counter);
        }
        scanner.close();
    }
}
