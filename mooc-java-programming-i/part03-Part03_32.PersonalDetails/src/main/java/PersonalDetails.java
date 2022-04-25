
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        int longest = 0;

        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            count++;
            String[] parts = data.split(",");
            sum += Integer.valueOf(parts[1]);
            if (parts[0].length() > longest) {
                longest = Integer.valueOf(parts[0].length());
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / count);

        scanner.close();
    }
}
