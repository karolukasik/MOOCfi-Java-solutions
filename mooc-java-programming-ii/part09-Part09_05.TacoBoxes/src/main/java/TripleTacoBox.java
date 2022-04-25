public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public void eat() {
        if (this.tacos <= 1) {
            this.tacos = 0;
        } else {
            this.tacos--;
        }
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }
}