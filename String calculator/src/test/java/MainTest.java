import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class MainTest {

    public StringCalculator stringCalculator = new StringCalculator();

    @ParameterizedTest
    @ValueSource(strings = {" "})
    public void should_return_0(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(0, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"1"})
    public void should_return_number(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(1, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2"})
    public void should_return_sum(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(3, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"1,20"})
    public void should_return_sum_of_multiple_digit(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(21, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"18,20"})
    public void should_return_sum_of_multiple_multiple_digit(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(38, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"183,200"})
    public void should_return_sum_of_multiple_multiple_multiple_digit(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(383, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"                       18,20"})
    public void should_return_sum_of_multiple_multiple_digit_with_spaces(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(38, result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"A,20"})
    public void should_return_sum_of_multiple_coma_multiple_digit(String number) {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> stringCalculator.add(number));
        Assertions.assertEquals("A,20",thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"231,20,560"})
    public void should_return_sum_of_atleast_three_multiple_digit(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(811, result);
    }

}
