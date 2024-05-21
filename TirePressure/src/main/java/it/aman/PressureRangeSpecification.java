package it.aman;

public class PressureRangeSpecification implements Specification {

    private final PressureRange pressureRange;

    public PressureRangeSpecification(PressureRange validatedPressureRange) {
        this.pressureRange = validatedPressureRange;
    }

    @Override
    public boolean isSatisfiedBy(Sensor sensor) {
        return sensor.popNextPressurePsiValue() < pressureRange.getLowPressureThreshold()
                || pressureRange.getHighPressureThreshold() < sensor.popNextPressurePsiValue();
    }
}
