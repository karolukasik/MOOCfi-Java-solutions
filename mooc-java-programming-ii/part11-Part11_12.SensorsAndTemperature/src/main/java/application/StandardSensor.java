package application;

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;

    }

    @Override
    public void setOff() {
        return;

    }

    @Override
    public int read() {
        return value;
    }

}
