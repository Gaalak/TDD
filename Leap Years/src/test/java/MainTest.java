import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @ParameterizedTest
    @ValueSource (ints = {2000})
    public void should_divided_by_400(int nb){
        String result = Main.anneeBissextile(nb);
        assertEquals("Année bissextile",result);
    }

    @ParameterizedTest
    @ValueSource (ints = {1700, 1800, 1900})
    public void should_divided_by_100_and_not_400(int nb){
        String result = Main.anneeBissextile(nb);
        assertEquals("Année non bissextile",result);
    }

    @ParameterizedTest
        @ValueSource (ints = {2008, 2012, 2016})
        public void should_divided_by_4_and_not_100(int nb){
            String result = Main.anneeBissextile(nb);
            assertEquals("Année bissextile",result);
        }


        @ParameterizedTest
        @ValueSource (ints = {2017, 2018, 2019})
        public void shouldnt_divided_by_4(int nb){
            String result = Main.anneeBissextile(nb);
            assertEquals("Année non bissextile",result);
        }

}
