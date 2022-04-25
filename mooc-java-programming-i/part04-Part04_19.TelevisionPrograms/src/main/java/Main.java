import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String inputProgramName;
        int inputProgramDuration;
        int durationLimit;

        while (true) {
            System.out.print("Name: ");
            inputProgramName = scanner.nextLine();
            if (inputProgramName.equals("")) {
                break;
            }
            System.out.print("Duration: ");
            inputProgramDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(inputProgramName, inputProgramDuration));
        }
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        durationLimit = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= durationLimit) {
                System.out.println(program);
            }
        }
    }
}
