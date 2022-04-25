
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PairOfContainers pair = new PairOfContainers();

        while (true) {
            System.out.println(pair);
            System.out.print("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = 0;
            if (parts.length != 1) {
                amount = Integer.valueOf(parts[1]);
            }

            if (parts[0].equals("add")) {
                pair.add(amount);
            } else if (parts[0].equals("remove")) {
                pair.remove(amount);
            } else if (parts[0].equals("move")) {
                pair.move(amount);
            } else {
                continue;
            }
        }

        scan.close();

    }

}
