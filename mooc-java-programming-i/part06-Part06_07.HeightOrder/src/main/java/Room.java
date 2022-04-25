import java.util.ArrayList;

public class Room {
    private ArrayList<Person> listOfPeople;

    public Room() {
        this.listOfPeople = new ArrayList<>();
    }

    public void add(Person person) {
        this.listOfPeople.add(person);
    }

    public boolean isEmpty() {
        if (this.listOfPeople.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.listOfPeople;
    }

    public Person shortest() {
        if (this.listOfPeople.isEmpty()) {
            return null;
        }
        Person returnPerson = this.listOfPeople.get(0);
        for (Person person : listOfPeople) {
            if (person.getHeight() < returnPerson.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.listOfPeople.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.listOfPeople.remove(shortest);
        return shortest;
    }

}
