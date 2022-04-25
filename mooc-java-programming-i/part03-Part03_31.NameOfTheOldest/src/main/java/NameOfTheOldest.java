
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfOldest = "test";
        // String nameOfOldest;
        int oldest = 1;
        while (true) {

            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String[] parts = data.split(",");

            if (Integer.valueOf(parts[1]) > oldest) {
                nameOfOldest = parts[0];
                oldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}