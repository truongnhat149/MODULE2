package Exercise.test_first.next_day_calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NextDayCalculatorTest {

    @Test
    void testNextDayCalculator(){
        int day = 3;
        int expected = 4;
        assertEquals(expected, day);
    }
}
