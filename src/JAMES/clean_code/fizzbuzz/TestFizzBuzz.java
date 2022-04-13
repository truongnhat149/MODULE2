package exercise_james.clean_code.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

   @Test
   @DisplayName("Testing % 3")
    void fizzBuzz3() {
       int number = 3;
       String expected = "Fizz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
   }

    @Test
    @DisplayName("Testing % 5")
    void fizzBuzz5() {
       int number = 5;
       String expected = "Buzz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing % 3")
    void fizzBuzz6() {
       int number = 6;
       String expected = "Fizz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
    }

    @Test
    @DisplayName(" Testing % 5")
    void fizzBuzz10() {
       int number = 10;
       String expected = "Buzz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing % 3 && % 5")
    void fizzBuzz15() {
       int number = 15;
       String expected = "FizzBuzz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testin % 3 && % 5")
    void fizzBuzz30() {
       int number = 30;
       String expected = "FizzBuzz";

       String result = FizzBuzz.fizzBuzz(number);
       assertEquals(expected, result);
    }


}
