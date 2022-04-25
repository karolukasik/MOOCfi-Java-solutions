
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String parts[] = data.split(" ");
            System.out.println(parts[parts.length - 1]);
        }

    }
}
