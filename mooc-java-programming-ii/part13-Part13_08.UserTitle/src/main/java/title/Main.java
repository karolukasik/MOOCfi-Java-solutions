package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Set the title of the window: ");
        String userInput = scan.nextLine();

        String titleToPassToMethod = "--userTitle=" + userInput;

        Application.launch(UserTitle.class, titleToPassToMethod);

        scan.close();
    }

}
