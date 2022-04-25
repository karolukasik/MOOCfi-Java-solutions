public class Container {
    private int capacity;
    private int usedCapacity;

    public Container() {
        this.capacity = 100;
        this.usedCapacity = 0;
    }

    public int contains() {
        return this.usedCapacity;
    }

    public void add(int amount) {
        if (amount > 0) {
            int safeAmount = this.usedCapacity + amount <= this.capacity ? amount : this.capacity - this.usedCapacity;
            this.usedCapacity += safeAmount;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            int safeAmount = this.usedCapacity >= amount ? amount : this.usedCapacity;
            this.usedCapacity -= safeAmount;
        }
    }

    @Override
    public String toString() {
        return this.usedCapacity + "/" + this.capacity;
    }

}
