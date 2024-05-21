package it.aman;

import java.util.Random;

// https://github.com/emilybache/Racing-Car-Katas/blob/main/Java/TirePressureMonitoringSystem/src/main/java/tddmicroexercises/tirepressuremonitoringsystem/Sensor.java

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class Sensor {
    public static final double OFFSET = 16;
    private static final double LOW_PRESSURE_THRESHOLD = 17;
    private static final double HIGH_PRESSURE_THRESHOLD = 21;


    public boolean isPressureThresholdReached() {
        double psiPressureValue = this.popNextPressurePsiValue();
        return psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue;
    }

    public double popNextPressurePsiValue() {
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure( );

        return OFFSET + pressureTelemetryValue;
    }

    private static double samplePressure() {
        // placeholder implementation that simulate a real sensor in a real tire
        Random basicRandomNumbersGenerator = new Random();
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue;
    }
}
