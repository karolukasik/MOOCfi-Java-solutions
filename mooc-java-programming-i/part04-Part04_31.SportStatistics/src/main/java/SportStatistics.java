
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int numberOfGames = 0;
        int numberOfWins = 0;
        int numberOfLosses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.contains(team)) {
                    numberOfGames++;
                    String parts[] = line.split(",");
                    int firstTeamPoints = Integer.valueOf(parts[2]);
                    int secondTeamPoints = Integer.valueOf(parts[3]);
                    String winner;
                    if (firstTeamPoints > secondTeamPoints) {
                        winner = parts[0];
                    } else {
                        winner = parts[1];
                    }
                    if (team.equals(winner)) {
                        numberOfWins++;
                    } else {
                        numberOfLosses++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + numberOfWins);
        System.out.println("Losses: " + numberOfLosses);
        scan.close();
    }

}
