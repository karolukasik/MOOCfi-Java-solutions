import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsDatabase;

    public Abbreviations() {
        this.abbreviationsDatabase = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        if (!hasAbbreviation(abbreviation)) {
            this.abbreviationsDatabase.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        if (this.abbreviationsDatabase.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        if (hasAbbreviation(abbreviation)) {
            return this.abbreviationsDatabase.get(abbreviation);
        } else {
            return null;
        }
    }

    public String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }

}
