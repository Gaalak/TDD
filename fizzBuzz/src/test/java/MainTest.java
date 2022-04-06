import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void shouldReturnOne() {
        String result = Main.fizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    public void shouldReturnTwo() {
        String result = Main.fizzBuzz(2);
        assertEquals("2", result);
    }

    @Test
    public void shouldReturnFizzWhenParameterIsMultipleOfThree() {
        String result = Main.fizzBuzz(3);
        assertEquals("fizz", result);

        String result6 = Main.fizzBuzz(6);
        assertEquals("fizz", result6);
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15})
    public void shouldReturnBuzzWhenParameterIsMultipleOfFive(Integer nb) {
        String result5 = Main.fizzBuzz(nb);
        assertTrue(result5.contains("buzz"));

    }

    @Test
    public void shouldReturnFizzbuzzWhenParameterIsMultipleOfFiveAndThree() {
        String result = Main.fizzBuzz(15);
        assertEquals("fizzbuzz", result);
    }

}
