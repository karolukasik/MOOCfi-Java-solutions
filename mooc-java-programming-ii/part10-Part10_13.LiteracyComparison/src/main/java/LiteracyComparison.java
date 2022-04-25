
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> data = readFileAndFormat("literacy.csv");
        data.stream().forEach(line -> System.out.println(line));

    }

    public static ArrayList<String> readFileAndFormat(String fileName) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]);
                    })
                    .map(
                            parts -> parts[3] + " (" + parts[4] + "), " + parts[2].replaceAll("\\s\\(%\\)", "").trim()
                                    + ", "
                                    + parts[5])
                    .forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
        return lines;
    }
}
