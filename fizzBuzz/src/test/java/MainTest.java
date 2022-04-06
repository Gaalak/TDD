import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void shouldReturnOne(){
        String result = Main.fizzBuzz(1);
        assertEquals("1",result);
    }

    @Test
    public void shouldReturnTwo(){
        String result = Main.fizzBuzz(2);
        assertEquals("2",result);
    }

    @Test
    public void shouldReturnFizzWhenParameterIsMultipleOfThree(){
        String result = Main.fizzBuzz(3);
        assertEquals("fizz",result);

        String result6 = Main.fizzBuzz(6);
        assertEquals("fizz",result6);
    }

    @Test
    public void shouldReturnBuzzWhenParameterIsMultipleOfFive(){
        String result5 = Main.fizzBuzz(5);
        assertEquals("buzz",result5);

        String result10 = Main.fizzBuzz(10);
        assertEquals("buzz",result10);
    }

    @Test
    public void shouldReturnFizzbuzzWhenParameterIsMultipleOfFiveAndThree(){
        String result = Main.fizzBuzz(15);
        assertEquals("fizzbuzz",result);
    }

}
