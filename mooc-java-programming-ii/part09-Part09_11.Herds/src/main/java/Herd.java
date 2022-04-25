import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> listOfAllSpecies;

    public Herd() {
        this.listOfAllSpecies = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable species : listOfAllSpecies) {
            species.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.listOfAllSpecies.add(movable);
    }

    @Override
    public String toString() {
        String representation = "";
        for (Movable species : listOfAllSpecies) {
            representation += species.toString() + "\n";
        }
        String trimmed = representation.replaceAll("([\\n\\r]+\\s*)*$", "");
        return trimmed;
    }
}
