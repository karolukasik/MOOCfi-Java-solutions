import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int i = 1;
        for (String string : todoList) {
            System.out.println(i + ": " + string);
            i++;
        }
    }

    public void remove(int number) {
        if (number > 0 && number <= this.todoList.size()) {
            this.todoList.remove(number - 1);
        }
    }
}
