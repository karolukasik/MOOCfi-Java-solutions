
public class MainProgram {

    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(5);

        firstCounter.increase(4);
        secondCounter.increase();
        secondCounter.decrease(-1);

        System.out.println(firstCounter.value());
        System.out.println(secondCounter.value());
    }
}
