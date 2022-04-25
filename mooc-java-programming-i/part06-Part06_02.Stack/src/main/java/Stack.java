import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = this.stack.size() - 1; i >= 0; i--) {
            newList.add(this.stack.get(i));
        }
        return newList;
    }

    public String take() {
        String taken = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return taken;
    }

}
