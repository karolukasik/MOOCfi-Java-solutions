
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String birdLatinName = scan.nextLine();
                birds.add(new Bird(birdName, birdLatinName));
            }
            if (command.equals("Observation")) {
                if (birds.isEmpty()) {
                    continue;
                }
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                if (containsBird(birds, birdName)) {
                    int index = indexOfSearchedBird(birds, birdName);
                    birds.get(index).wasObserved();
                } else {
                    System.out.println("Not a bird!");
                }
            }
            if (command.equals("All")) {
                if (birds.isEmpty()) {
                    continue;
                }
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }
            if (command.equals("One")) {
                if (birds.isEmpty()) {
                    continue;
                }
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                int index = indexOfSearchedBird(birds, birdName);
                System.out.println(birds.get(index));
            }
        }
        scan.close();
    }

    public static boolean containsBird(ArrayList<Bird> birds, String searchedBird) {
        for (Bird bird : birds) {
            if (searchedBird.equals(bird.getName())) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfSearchedBird(ArrayList<Bird> birds, String searchedBird) {
        int birdIndex = 0;
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(searchedBird)) {
                birdIndex = i;
            }
        }
        return birdIndex;
    }

}
