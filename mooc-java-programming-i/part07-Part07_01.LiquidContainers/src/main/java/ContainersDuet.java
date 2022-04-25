public class ContainersDuet {
    private LiquidContainer firstContainer;
    private LiquidContainer secondContainer;

    public ContainersDuet(LiquidContainer first, LiquidContainer second) {
        this.firstContainer = first;
        this.secondContainer = second;
    }

    public void move(int movedAmount) {
        int safeMovedAmount = movedAmount <= firstContainer.getUsedCapacity() ? movedAmount
                : firstContainer.getUsedCapacity();

        firstContainer.remove(safeMovedAmount);
        secondContainer.add(safeMovedAmount);
    }

    public void add(int addedVolume) {
        this.firstContainer.add(addedVolume);
    }

    public void remove(int removedValue) {
        this.secondContainer.remove(removedValue);
    }

    @Override
    public String toString() {
        return "First: " + this.firstContainer + "\n" + "Second: " + this.secondContainer;
    }
}
