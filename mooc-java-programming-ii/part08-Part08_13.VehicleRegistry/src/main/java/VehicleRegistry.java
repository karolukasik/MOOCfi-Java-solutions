import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate plate, String owner) {
        if (this.registry.containsKey(plate)) {
            return false;
        }
        this.registry.put(plate, owner);
        return true;
    }

    public String get(LicensePlate plate) {
        if (this.registry.containsKey(plate)) {
            return this.registry.get(plate);
        }
        return null;
    }

    public boolean remove(LicensePlate plate) {
        if (this.registry.containsKey(plate)) {
            this.registry.remove(plate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (String owner : this.registry.values()) {
            if (!(ownersList.contains(owner))) {
                System.out.println(owner);
                ownersList.add(owner);
            }
        }
    }

}
