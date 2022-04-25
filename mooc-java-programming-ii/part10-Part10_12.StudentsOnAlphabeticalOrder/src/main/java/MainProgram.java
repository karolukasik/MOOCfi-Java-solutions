import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("amo1");

        System.out.println(first.compareTo(second));
        ArrayList<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);

        students.stream().sorted().forEach(student -> System.out.println(student));
    }
}
