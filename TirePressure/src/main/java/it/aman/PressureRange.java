package it.aman;

public class PressureRange {

    private final double lowPressureThreshold;
    private final double highPressureThreshold;

    public PressureRange(double lowPressureThreshold, double highPressureThreshold) {
        this.lowPressureThreshold = lowPressureThreshold;
        this.highPressureThreshold = highPressureThreshold;
    }

    public double getLowPressureThreshold() {
        return lowPressureThreshold;
    }

    public double getHighPressureThreshold() {
        return highPressureThreshold;
    }

}
