
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            input.add(in);
        }
        System.out.println("");

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decision = scanner.nextLine();
        double average = 0;
        if (decision.equals("n")) {
            decision = "negative";
            average = input.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
        }
        if (decision.equals("p")) {
            decision = "positive";
            average = input.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
        }

        System.out.println("Average of " + decision + " numbers: " + average);

    }

}
