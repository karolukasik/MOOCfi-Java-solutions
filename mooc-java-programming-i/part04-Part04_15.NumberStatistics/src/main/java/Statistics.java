//import java.util.ArrayList;

public class Statistics {
    private int count;
    // private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // this.numbers.add(number);
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        // for (int number : numbers) {
        // sum += number;
        // }
        return this.sum;
    }

    public double average() {
        if (this.count != 0) {
            return (double) this.sum / this.count;
        } else {
            return 0;
        }

    }
}
