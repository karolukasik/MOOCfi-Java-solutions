
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer first = new LiquidContainer(100);
        LiquidContainer second = new LiquidContainer(100);
        ContainersDuet pair = new ContainersDuet(first, second);

        while (true) {
            System.out.println(pair);
            System.out.print("");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (Integer.valueOf(parts[1]) > 0) {
                String command = parts[0];
                int value = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    pair.add(value);
                }
                if (command.equals("remove")) {
                    pair.remove(value);
                }
                if (command.equals("move")) {
                    pair.move(value);
                }
            }
        }
        scan.close();
    }

}
