
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<Integer>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            input.add(Integer.valueOf(in));
        }
        System.out.println("");

        List<Integer> toPrint = positive(input);
        System.out.println(toPrint);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        return positiveNumbers;
    }

}
