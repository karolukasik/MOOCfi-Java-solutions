
public class Hideout<T> {
    private T hiddenObject;

    public Hideout() {
    }

    public boolean isInHideout() {
        if (this.hiddenObject == null) {
            return false;
        }
        return true;
    }

    public void putIntoHideout(T toHide) {
        this.hiddenObject = toHide;
    }

    public T takeFromHideout() {
        T toReturn = this.hiddenObject;
        this.hiddenObject = null;
        return toReturn;
    }
}
