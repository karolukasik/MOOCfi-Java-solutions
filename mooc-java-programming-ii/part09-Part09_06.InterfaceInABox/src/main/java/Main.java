
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box smallBox = new Box(3);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        smallBox.add(new Book("Dupa", "kozia", 2.8));
        smallBox.add(new Book("Grecia", "felcia", 2.8));
        smallBox.add(new CD("tututu", "tete", 2021));
        box.add(smallBox);

        System.out.println(smallBox);
        System.out.println(box);
    }

}
