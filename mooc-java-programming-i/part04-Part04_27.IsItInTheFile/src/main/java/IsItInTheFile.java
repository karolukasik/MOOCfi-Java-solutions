
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        // boolean wasFound = false;
        // boolean exceptionCatched = false;

        // try (Scanner fileReader = new Scanner(Paths.get(file))) {
        // while (fileReader.hasNextLine()) {
        // String row = fileReader.nextLine();
        // if (row.contains(searchedFor)) {
        // System.out.println("Found!");
        // wasFound = true;
        // }
        // }

        // } catch (Exception e) {
        // System.out.println("Reading the file " + file + " failed.");
        // exceptionCatched = true;
        // }
        // if (!wasFound && !exceptionCatched) {
        // System.out.println("Not found.");
        // }

        int lines = 0;
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.contains(searchedFor)) {
                    continue;
                }

                lines++;
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");

        }

        if (lines == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }

        scanner.close();
    }
}
