package it.aman;

public class Alarm {

    private Sensor sensor = new Sensor();

    public boolean isAlarmOn() {
        return this.sensor.isPressureThresholdReached();
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
