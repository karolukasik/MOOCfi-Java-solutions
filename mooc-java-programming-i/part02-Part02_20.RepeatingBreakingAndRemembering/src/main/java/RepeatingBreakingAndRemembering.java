
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int inputNumber;
        int sum = 0;
        int counter = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (inputNumber % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            sum += inputNumber;
            counter++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + ((double) sum / counter));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
        scanner.close();
    }
}
