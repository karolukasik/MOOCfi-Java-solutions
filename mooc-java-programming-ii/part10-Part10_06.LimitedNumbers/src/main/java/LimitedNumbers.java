
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        while (true) {
            int in = Integer.valueOf(scanner.nextLine());
            if (in < 0) {
                break;
            }
            input.add(in);
        }

        input.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(number -> System.out.println(number));
        scanner.close();
    }
}
