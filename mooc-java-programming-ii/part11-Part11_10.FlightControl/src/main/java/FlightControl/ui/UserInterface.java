package FlightControl.ui;

import java.util.Scanner;

import FlightControl.logic.FlightControl;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.flightControl = new FlightControl();
    }

    public void start() {
        startAirportAssetControl();
        startFlightControl();
    }

    public void startAirportAssetControl() {
        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            assetControlCommandManager(command);
        }
    }

    public void startFlightControl() {
        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            flightControlCommandManager(command);
        }
    }

    public void assetControlCommandManager(String command) {
        if (command.equals("1")) {
            System.out.print("Give the airplane id: ");
            String planeID = scanner.nextLine();
            System.out.print("Give the airplane capacity: ");
            int planeCapacity = Integer.valueOf(scanner.nextLine());
            this.flightControl.addAirplane(planeID, planeCapacity);

        } else if (command.equals("2")) {
            System.out.print("Give the airplane id: ");
            String planeID = scanner.nextLine();
            System.out.print("Give the departure airport id: ");
            String departueID = scanner.nextLine();
            System.out.print("Give the target airport id: ");
            String targetID = scanner.nextLine();
            flightControl.addFlight(planeID, departueID, targetID);

        } else {
            System.out.println("Unknown command");
        }
    }

    public void flightControlCommandManager(String command) {
        if (command.equals("1")) {
            flightControl.printAirplanes();

        } else if (command.equals("2")) {
            flightControl.printFlights();

        } else if (command.equals("3")) {
            System.out.print("Give the airplane id: ");
            String planeID = scanner.nextLine();
            if (flightControl.getPlane(planeID) == null) {
                System.out.println("The given plane is not on the planes list");

            } else {
                System.out.println(flightControl.getPlane(planeID));
            }

        } else {
            System.out.println("Unknown command");
        }
    }
}
