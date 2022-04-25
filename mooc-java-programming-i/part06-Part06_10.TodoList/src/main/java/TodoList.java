import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listOfTasks;

    public TodoList() {
        this.listOfTasks = new ArrayList<>();
    }

    public void add(String task) {
        this.listOfTasks.add(task);
    }

    public void print() {
        for (String task : listOfTasks) {
            int index = listOfTasks.indexOf(task) + 1;
            System.out.println(index + ": " + task);
        }
    }

    public void remove(int number) {
        this.listOfTasks.remove(number - 1);
    }
}
