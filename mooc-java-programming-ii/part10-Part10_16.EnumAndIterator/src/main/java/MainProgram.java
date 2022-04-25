
public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        Person g = new Person("Kot", Education.MA);
        t.add(h);
        t.add(g);
        t.print();

    }
}
