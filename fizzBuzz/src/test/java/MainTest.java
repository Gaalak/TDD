import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,4})
    public void should_return_number_when_is_not_fizz_or_buzz(Integer nb) {
        String result = Main.fizzBuzz(nb);
        assertEquals(nb.toString(), result);
    }



    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    public void should_return_fizz_when_parameter_is_multiple_of_three(Integer nb) {
        String result = Main.fizzBuzz(nb);
        assertEquals("fizz", result);
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15})
    public void should_return_buzz_when_parameter_is_multiple_of_five(Integer nb) {
        String result5 = Main.fizzBuzz(nb);
        assertTrue(result5.contains("buzz"));

    }

    @Test
    public void should_return_fizzbuzz_when_parameter_is_multiple_of_three_and_five() {
        String result = Main.fizzBuzz(15);
        assertEquals("fizzbuzz", result);
    }

}
