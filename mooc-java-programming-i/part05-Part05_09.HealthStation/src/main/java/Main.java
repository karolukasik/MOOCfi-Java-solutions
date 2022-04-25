
public class Main {

    public static void main(String[] args) {
        HealthStation healthStation = new HealthStation();
        Person michal = new Person("Michal", 31, 180, 78);
        Person karo = new Person("Karo", 30, 169, 62);

        System.out.println("Waga Michasia: " + healthStation.weigh(michal));
        System.out.println("Waga Karo: " + healthStation.weigh(karo));

        healthStation.feed(michal);
        System.out.println("Waga Michasia: " + healthStation.weigh(michal));
        System.out.println("Waga Karo: " + healthStation.weigh(karo));
        System.out.println(healthStation.weighings());
    }
}
