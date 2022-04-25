import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card first, Card second) {
        if (first.getSuit() == second.getSuit()) {
            return first.getValue() - second.getValue();
        }

        return first.getSuit().compareTo(second.getSuit());
    }

}
