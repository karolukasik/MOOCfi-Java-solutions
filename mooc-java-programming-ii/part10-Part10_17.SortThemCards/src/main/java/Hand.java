import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }

    public void add(Card card) {
        this.cardsInHand.add(card);
    }

    public void print() {
        cardsInHand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        ArrayList<Card> sorted = new ArrayList<>();
        this.cardsInHand.stream().sorted().forEach(card -> sorted.add(card));
        this.cardsInHand = sorted;
    }

    @Override
    public int compareTo(Hand compared) {
        int thisSumOnHand = this.cardsInHand.stream()
                .mapToInt(card -> (card.getValue()))
                .reduce(0, (partialSum, card) -> partialSum + card);
        int comparedSumOnHand = compared.cardsInHand.stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, (partialSum, card) -> partialSum + card);
        return thisSumOnHand - comparedSumOnHand;
    }

    public void sortBySuit() {
        Collections.sort(this.cardsInHand, new BySuitInValueOrder());
    }

}
