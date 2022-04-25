import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storages;

    public StorageFacility() {
        this.storages = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storages.putIfAbsent(unit, new ArrayList<>());
        this.storages.get(unit).add(item);

    }

    public ArrayList<String> contents(String unit) {
        ArrayList<String> content = new ArrayList<>();
        if (this.storages.containsKey(unit)) {
            content = this.storages.get(unit);
        }
        return content;
    }

    public void remove(String unit, String item) {
        if (this.storages.containsKey(unit)) {
            this.storages.get(unit).remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> notEmptyUnits = new ArrayList<>();
        for (String unit : this.storages.keySet()) {
            if (!(this.storages.get(unit).isEmpty())) {
                notEmptyUnits.add(unit);
            }

        }
        return notEmptyUnits;

    }

}
