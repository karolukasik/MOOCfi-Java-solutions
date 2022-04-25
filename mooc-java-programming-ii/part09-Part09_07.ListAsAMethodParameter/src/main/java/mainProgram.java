import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        System.out.println(returnSize(numbers));

    }

    public static int returnSize(List list) {
        return list.size();
    }
}
