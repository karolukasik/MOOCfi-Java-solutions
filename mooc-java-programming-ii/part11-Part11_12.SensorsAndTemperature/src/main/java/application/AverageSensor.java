package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    private List<Sensor> listOfSensors;
    private List<Integer> readingHistory;

    public AverageSensor() {
        this.listOfSensors = new ArrayList<>();
        this.readingHistory = new ArrayList<>();
    }

    public void addSensor(Sensor newSensor) {
        this.listOfSensors.add(newSensor);
    }

    @Override
    public boolean isOn() {
        return this.listOfSensors.stream().allMatch(sensor -> sensor.isOn());
    }

    @Override
    public void setOn() {
        this.listOfSensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        Random random = new Random();
        if (!listOfSensors.isEmpty()) {
            Sensor randomSensor = listOfSensors.get(random.nextInt(listOfSensors.size()));
            randomSensor.setOff();
        }

    }

    @Override
    public int read() {
        if (this.listOfSensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }

        double average = this.listOfSensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();

        int averageAsInt = (int) average;
        this.readingHistory.add(averageAsInt);
        return averageAsInt;
    }

    public List<Integer> readings() {
        return readingHistory;
    }
}
