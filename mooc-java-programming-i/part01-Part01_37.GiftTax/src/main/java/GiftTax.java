
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        int lvl1 = 5000;
        int lvl2 = 25000;
        int lvl3 = 55000;
        int lvl4 = 200000;
        int lvl5 = 1000000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value >= lvl5) {
            System.out.println("Tax: " + (142100 + ((double) value - lvl5) * 0.17));
        } else if (value >= lvl4) {
            System.out.println("Tax: " + (22100 + ((double) value - lvl4) * 0.15));
        } else if (value >= lvl3) {
            System.out.println("Tax: " + (4700 + ((double) value - lvl3) * 0.12));
        } else if (value >= lvl2) {
            System.out.println("Tax: " + (1700 + ((double) value - lvl2) * 0.1));
        } else if (value >= lvl1) {
            System.out.println("Tax: " + (100 + ((double) value - lvl1) * 0.08));
        } else {
            System.out.println("No tax!");
        }
        scan.close();
    }
}
