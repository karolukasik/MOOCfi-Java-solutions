
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        for (int i = 6; i >= 0; i--) {
            counter.printValue();
            counter.decrement();
        }
        counter.reset();
        counter.printValue();
        counter.decrement();
        counter.printValue();
    }
}
