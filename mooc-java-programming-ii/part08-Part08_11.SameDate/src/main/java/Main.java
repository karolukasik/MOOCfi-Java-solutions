
public class Main {

    public static void main(String[] args) {
        SimpleDate karoBirthday = new SimpleDate(4, 2, 1991);
        SimpleDate michalBirthday = new SimpleDate(12, 8, 1990);

        System.out.println(karoBirthday.equals(michalBirthday));
        System.out.println(karoBirthday.equals(new SimpleDate(4, 2, 1991)));
    }
}
