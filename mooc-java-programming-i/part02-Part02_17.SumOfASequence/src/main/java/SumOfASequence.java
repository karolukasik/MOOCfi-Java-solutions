
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = number; i > 0; i--) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
