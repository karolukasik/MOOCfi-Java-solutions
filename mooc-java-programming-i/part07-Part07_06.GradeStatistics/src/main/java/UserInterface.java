import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Grades gradesList = new Grades(50);
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            gradesList.add(input);
        }
        System.out.println("Point average (all): " + gradesList.averageAll());
        if (gradesList.averageOfPassed() == -2) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gradesList.averageOfPassed());
        }
        System.out.println("Pass percentage: " + gradesList.percentageOfPassed());
        System.out.println("Grade distribution:");
        gradesList.gradeDistribution();
    }

}
