package FlightControl;

import java.util.Scanner;

import FlightControl.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }
}
