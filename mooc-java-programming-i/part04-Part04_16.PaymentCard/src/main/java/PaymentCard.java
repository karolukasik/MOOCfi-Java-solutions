public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance >= 150) {
                this.balance = 150;
            }
        }
    }

    public void eatAffordably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }

    }

    public void eatHeartily() {
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
