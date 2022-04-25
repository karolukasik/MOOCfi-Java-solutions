package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    private List<String> words;
    private Map<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        this.addTranslation("test", "test");
    }

    public String getTranslation(String word) {
        return this.translations.get(word);
    }

    public void addTranslation(String word, String translation) {
        if (!this.words.contains(word)) {
            this.words.add(word);
            this.translations.put(word, translation);
        }
        return;
    }

    public String randomWord() {
        Random rnd = new Random();
        return this.words.get(rnd.nextInt(this.words.size()));
    }
}
