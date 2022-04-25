
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());

        Cube small = new Cube(input);
        System.out.println(small);

        scanner.close();
    }
}
