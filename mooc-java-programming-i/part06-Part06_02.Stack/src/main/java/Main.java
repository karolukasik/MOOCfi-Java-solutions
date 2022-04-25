
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();

        s.add("dol");
        s.add("srodek");
        s.add("gora");

        System.out.println(s.values());
        System.out.println(s.take());
        System.out.println(s.values());
    }
}
