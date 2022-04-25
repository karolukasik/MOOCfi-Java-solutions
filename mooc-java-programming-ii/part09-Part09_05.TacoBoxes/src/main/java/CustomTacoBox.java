public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
