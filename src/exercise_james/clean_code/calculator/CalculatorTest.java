package exercise_james.clean_code.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    @DisplayName("Testing addtion")
    void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculator(a , b , o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtration")
    void testCalculatorSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;
        int result = Calculator.calculator(a, b ,o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int a = 2;
        int b = 4;
        char o = '*';
        int expected = 8;

        int result = Calculator.calculator(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculator(a, b ,o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by 0")
    void testCalculateDivBy0(){
        int a = 2;
        int b = 0; // ở đây sẽ bị lỗi ngoại lệ
        char o = '/';

        assertThrows(RuntimeException.class, () -> {Calculator.calculator(a, b, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class, () -> {Calculator.calculator(a, b, o);});
    }


}
