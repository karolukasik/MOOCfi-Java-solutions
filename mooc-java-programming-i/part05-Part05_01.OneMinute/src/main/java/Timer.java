public class Timer {
    private ClockHand seconds = new ClockHand(60);
    private ClockHand hundredths = new ClockHand(100);

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }

}
