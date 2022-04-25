public class LiquidContainer {
    private int capacity;
    private int usedCapacity;

    public LiquidContainer(int capacity) {
        this.capacity = capacity;
        this.usedCapacity = 0;
    }

    public void add(int addedVolume) {
        this.usedCapacity += addedVolume;
        if (this.usedCapacity >= this.capacity) {
            this.usedCapacity = this.capacity;
        }
    }

    public void remove(int removedValue) {
        if (this.usedCapacity <= removedValue) {
            this.usedCapacity = 0;
        } else {
            this.usedCapacity -= removedValue;
        }
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return this.usedCapacity + "/" + this.capacity;
    }
}
