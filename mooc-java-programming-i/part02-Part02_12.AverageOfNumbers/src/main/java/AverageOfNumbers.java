
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int number;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            counter++;
            sum = sum + number;
        }
        System.out.println("Average of the numbers: " + (double) sum / counter);
        scanner.close();
    }
}
