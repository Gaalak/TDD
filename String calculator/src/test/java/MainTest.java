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
    @ValueSource(strings = {"C,B,20"})
    public void should_return_sum_of_multiple_coma_multiple_digit(String number) {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> stringCalculator.add(number));
        Assertions.assertEquals("C,B,20",thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"231,20,560"})
    public void should_return_sum_of_atleast_three_multiple_digit(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(811, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"    430,231,    20   ,560"})
    public void should_return_sum_of_atleast_four_multiple_digit_and_spaces(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(1241, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1\n2,3"})
    public void should_return_sum_of_multiple_digit_and_newline(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(6, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {";\n5;6"})
    public void should_return_sum_of_multiple_digit_and_newline_with_new_delimiter(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(11, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"coucou\n5coucou6"})
    public void should_return_sum_of_multiple_digit_and_newline_with_new_delimiter_Coucou(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(11, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"cE89\n5cE896"})
    public void should_return_sum_of_multiple_digit_and_newline_with_new_delimiter_random_char(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(11, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"56\n5566"})
    public void should_return_sum_of_multiple_digit_and_newline_with_new_delimiter_same_number(String number) {
        int result = stringCalculator.add(number);
        Assertions.assertEquals(11, result);
    }





}
