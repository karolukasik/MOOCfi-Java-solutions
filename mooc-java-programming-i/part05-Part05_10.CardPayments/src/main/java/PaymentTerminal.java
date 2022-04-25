
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTILY_PRICE = 4.3;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= AFFORDABLE_PRICE) {
            this.money += AFFORDABLE_PRICE;
            this.affordableMeals++;
            return payment - AFFORDABLE_PRICE;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTILY_PRICE) {
            this.money += HEARTILY_PRICE;
            this.heartyMeals++;
            return payment - HEARTILY_PRICE;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(AFFORDABLE_PRICE)) {
            this.affordableMeals++;
            return true;
        }
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(HEARTILY_PRICE)) {
            this.heartyMeals++;
            return true;
        }
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
