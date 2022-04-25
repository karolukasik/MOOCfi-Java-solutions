
public class Main {

    public static void main(String[] args) {
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
