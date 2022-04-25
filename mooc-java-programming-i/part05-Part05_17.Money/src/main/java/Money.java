
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            if (this.cents < compared.cents) {
                return true;
            }
            return false;
        }
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }

        if (this.cents < decreaser.cents) {
            int newCents = 100 + this.cents - decreaser.cents;
            int newEuros = this.euros - 1 - decreaser.euros;
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        }

        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
