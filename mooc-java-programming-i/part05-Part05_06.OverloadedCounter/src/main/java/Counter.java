public class Counter {
    private int counterValue;

    public Counter(int value) {
        this.counterValue = value;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.counterValue;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.counterValue = this.counterValue + increaseBy;
        }
    }

    public void increase() {
        this.increase(1);
    };

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.counterValue = this.counterValue - decreaseBy;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

}
