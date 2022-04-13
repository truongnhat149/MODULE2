package exercise_james.test_first.simplecalculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Testing addition 0 - 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int excepted = 0;

        int result = SimpleCalculator.addition(first, second);
        assertEquals(excepted, result);

    }
    @Test
    @DisplayName("Testing addition 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.addition(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimpleCalculator.addition(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition 0 + 0")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = SimpleCalculator.addition(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtractiontraction 0 - 0")
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.subtraction(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction 1 - 0")
    public void testSub1and0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.subtraction(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction 0 - 1")
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.subtraction(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction 0 - 0")
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimpleCalculator.subtraction(first, second);
        assertEquals(expected, result);
    }
}
