
public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object plate) {
        if (this == plate) {
            return true;
        }

        if (!(plate instanceof LicensePlate)) {
            return false;
        }

        LicensePlate compared = (LicensePlate) plate;

        if (this.country.equals(compared.country) && this.liNumber.equals(compared.liNumber)) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
