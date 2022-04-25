
public class StarSign {

    public static void main(String[] args) {

        // The tests are not checking the main, so you can modify it freely.
        // NB: If the tests don't seem to pass, you should try the methods here
        // in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---"); // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 1;
        int j = 1;
        while (i <= size) {
            while (j <= size) {
                System.out.print("*");
                j++;
            }
            i++;
            j = 1;
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 1;
        int j = 1;
        while (i <= height) {
            while (j <= width) {
                System.out.print("*");
                j++;
            }
            j = 1;
            i++;
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = 1;
        while (i <= size) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            j = 1;
            i++;
        }
    }
}
