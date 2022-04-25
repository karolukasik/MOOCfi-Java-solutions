
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int inTheRange = 0;

        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                int readedNumber = Integer.valueOf(fileReader.nextLine());
                if (readedNumber >= lowerBound && readedNumber <= upperBound) {
                    inTheRange++;
                }
            }
            fileReader.close();
        } catch (Exception e) {
            scanner.close();
            System.out.println("Error: " + e.getMessage());
            return;
        }
        System.out.println("Numbers: " + inTheRange);
        scanner.close();
    }

}
