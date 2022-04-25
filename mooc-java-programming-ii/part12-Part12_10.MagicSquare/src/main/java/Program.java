
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare test = msFactory.createMagicSquare(3);
        System.out.println(test.sumsAreSame());
        System.out.println(test.allNumbersDifferent());

        System.out.println(msFactory.createMagicSquare(5));

    }

}
