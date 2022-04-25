package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
            }
            fileReader.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (FileWriter writer = new FileWriter(this.fileName)) {
            for (String key : dictionary.keySet()) {
                String toWrite = key + ":" + dictionary.get(key) + "\n";
                writer.write(toWrite);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!wordExistInDictionary(words)) {
            dictionary.put(words, translation);
        }
    }

    public boolean wordExistInDictionary(String word) {
        if (dictionary.containsKey(word) || dictionary.containsValue(word)) {
            return true;
        }
        return false;
    }

    public String getKey(String word) {
        for (String key : dictionary.keySet()) {
            if (word.equals(dictionary.get(key))) {
                return key;
            }
        }
        return "";

    }

    public String translate(String word) {
        if (wordExistInDictionary(word)) {
            if (dictionary.containsKey(word)) {
                return dictionary.get(word);
            } else {
                return getKey(word);
            }
        }
        return null;
    }

    public void delete(String word) {
        if (wordExistInDictionary(word)) {
            if (dictionary.containsKey(word)) {
                dictionary.remove(word);
            } else {
                dictionary.remove(getKey(word));
            }
        }
    }
}
