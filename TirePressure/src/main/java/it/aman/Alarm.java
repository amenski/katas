package it.aman;

public class Alarm {

    private final Sensor sensor;
    private final PressureRange pressureRange;

    private boolean alarmOn = false;

    public Alarm(Sensor sensor, PressureRange pressureRange) {
        this.sensor = sensor;
        this.pressureRange = pressureRange;
    }

    public void check() {
        if (new PressureRangeSpecification(pressureRange).isSatisfiedBy(sensor)) {
            this.alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return this.alarmOn;
    }
}
