
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(" ");
                int i = 0;
                while (i < pieces.length) {
                    String piece = pieces[i];
                    if (piece.contains("av")) {
                        System.out.println(piece);
                    }
                    i++;
                }
            }

        }

    }
}
