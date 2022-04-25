public class Container {
    private final int capacity;
    private int usedCapacity;

    public Container() {
        this.capacity = 100;
        this.usedCapacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public int contains() {
        return this.usedCapacity;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.usedCapacity + amount > this.capacity) {
                this.usedCapacity = this.capacity;
            } else {
                this.usedCapacity += amount;
            }
        }
    }

    public void remove(int amount) {
        int safeToRemove = this.usedCapacity > amount ? amount : this.usedCapacity;
        this.usedCapacity -= safeToRemove;
    }

    @Override
    public String toString() {
        return this.usedCapacity + "/" + this.capacity;
    }
}
