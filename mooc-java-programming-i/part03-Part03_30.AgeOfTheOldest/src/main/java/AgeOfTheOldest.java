
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 1;
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String[] separatedData = data.split(",");
            if (Integer.valueOf(separatedData[1]) > oldest) {
                oldest = Integer.valueOf(separatedData[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
