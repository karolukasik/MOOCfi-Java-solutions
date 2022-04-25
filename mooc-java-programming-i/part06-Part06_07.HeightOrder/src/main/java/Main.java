
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        for (int i = 5; i >= 0; i--) {
            System.out.println("Shortest: " + room.take());
            System.out.println("");
            for (Person person : room.getPersons()) {
                System.out.println(person);
            }
        }
    }
}
