import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    private List<Person> listOfPeople;

    public Employees() {
        this.listOfPeople = new ArrayList<>();
    };

    public void add(Person person) {
        this.listOfPeople.add(person);
    }

    public void add(List<Person> people) {
        people.stream().forEach(person -> this.listOfPeople.add(person));
    }

    public void print() {
        Iterator<Person> iterator = listOfPeople.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education degree) {
        Iterator<Person> iterator = listOfPeople.iterator();
        while (iterator.hasNext()) {
            Person now = iterator.next();
            if (now.getEducation() == degree) {
                System.out.println(now);
            }
        }

        // listOfPeople.stream()
        // .filter(person -> person.getEducation() == degree)
        // .forEach(person -> System.out.println(person));
    }

    public void fire(Education degree) {
        Iterator<Person> iterator = listOfPeople.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == degree) {
                iterator.remove();
            }
        }
    }
}
