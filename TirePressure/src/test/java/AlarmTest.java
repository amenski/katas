import it.aman.Alarm;
import it.aman.PressureRange;
import it.aman.Sensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlarmTest {

    private final PressureRange validPressureRange = new PressureRange(17, 21);

    @Test
    public void testAlarmIsFired() {
        Alarm alarm = new Alarm(new MockSensor(15), validPressureRange);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void testAlarmIsNotFired() {
        Alarm alarm = new Alarm(new MockSensor(17), validPressureRange);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }


    // no mocking framework used, hence the mock implementation
    private static class MockSensor extends Sensor {

        private final double nextPressurePsiValue;

        public MockSensor(double nextPressurePsiValue) {
            this.nextPressurePsiValue = nextPressurePsiValue;
        }

        @Override
        public double popNextPressurePsiValue() {
            return this.nextPressurePsiValue;
        }
    }
}
