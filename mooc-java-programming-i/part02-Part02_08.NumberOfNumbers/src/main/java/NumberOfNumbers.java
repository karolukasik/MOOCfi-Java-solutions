
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = 0;
        int number;
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                howMany = howMany + 1;
            }
        }
        System.out.println("Number of numbers: " + howMany);
        scanner.close();
    }
}
