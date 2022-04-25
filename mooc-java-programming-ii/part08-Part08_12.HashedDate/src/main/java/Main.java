
public class Main {

    public static void main(String[] args) {
        SimpleDate karoBirthday = new SimpleDate(4, 2, 1900);
        SimpleDate michalBirthday = new SimpleDate(12, 2, 1900);

        System.out.println(karoBirthday.hashCode());
        System.out.println(michalBirthday.hashCode());

    }
}
