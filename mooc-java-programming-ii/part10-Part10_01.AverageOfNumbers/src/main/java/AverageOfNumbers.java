
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        scanner.close();

        System.out.println("Average of the numbers: " + average(input));
    }

    public static double average(ArrayList<String> input) {
        double average = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        return average;
    }

}
