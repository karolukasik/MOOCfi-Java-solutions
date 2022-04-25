public class List<Type> {
    private Type[] values;
    private int nextFreeIndex;

    public List() {
        this.values = (Type[]) new Object[4];
        this.nextFreeIndex = 0;
    }

    public void add(Type object) {
        if (this.nextFreeIndex == values.length) {
            this.grow();
        }
        this.values[this.nextFreeIndex] = object;
        this.nextFreeIndex++;
    }

    public void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newArray = (Type[]) new Object[newSize];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }
        this.values = newArray;
    }

    public void remove(Type object) {
        int indexToRemove = this.indexOfValue(object);
        if (indexToRemove < 0) {
            return;
        }
        this.moveToTheLeft(indexToRemove);
        this.nextFreeIndex--;
    }

    public int indexOfValue(Type object) {
        for (int i = 0; i < this.nextFreeIndex; i++) {
            if (this.values[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.nextFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public boolean contains(Type object) {
        return this.indexOfValue(object) >= 0;
    }

    public Type value(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= this.nextFreeIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.nextFreeIndex + "]");
        }
        return this.values[index];
    }

    public int size() {
        return this.nextFreeIndex;
    }

}
