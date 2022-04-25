
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String pieces[] = data.split(" ");
            System.out.println(pieces[0]);
        }
        scanner.close();

    }
}
