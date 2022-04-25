public class PairOfContainers {
    private Container firstContainer;
    private Container secondContainer;

    public PairOfContainers() {
        this.firstContainer = new Container();
        this.secondContainer = new Container();
    }

    public void add(int amount) {
        this.firstContainer.add(amount);
    }

    public void move(int amount) {
        int safeAmountToMove = this.firstContainer.getUsedCapacity() > amount ? amount
                : this.firstContainer.getUsedCapacity();
        this.firstContainer.remove(safeAmountToMove);
        this.secondContainer.add(safeAmountToMove);
    }

    public void remove(int amount) {
        this.secondContainer.remove(amount);
    }

    @Override
    public String toString() {
        return "First: " + this.firstContainer.toString() + "\n" + "Second: " + secondContainer.toString();
    }
}
