
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String inputFirstName;
        String inputLastName;
        String inputIdentificationNumber;

        while (true) {
            System.out.print("First name: ");
            inputFirstName = scanner.nextLine();
            if (inputFirstName.equals("")) {
                break;
            }
            System.out.print("Last name: ");
            inputLastName = scanner.nextLine();

            System.out.print("Identification number: ");
            inputIdentificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(inputFirstName, inputLastName, inputIdentificationNumber));
        }

        System.out.println("");
        for (PersonalInformation position : infoCollection) {
            System.out.println(position.getFirstName() + " " + position.getLastName());
        }

        scanner.close();

    }
}
