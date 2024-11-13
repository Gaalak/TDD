package Java.Fonction.cours;
import java.util.function.Function;
import java.util.function.Predicate;
public class Lambda {
    public static void main(String[] args) {
        new DoubleNotOver10Validator().test(12.0);
        Function<Double, Boolean> doubleValidatorisOver30 = b -> b > 30.0;
        // Données
        // Passer par des pipelines de lambda
        // Suite de fonction déclarée à la volée
         doubleValidatorisOver30.apply(30.0);
         ///////////////////////////
         DoubleValidator validate = d -> d > 30.0;
         OtherDoubleValidator validateToo = d -> d > 30.0;
         System.out.println(useValidator(validate::test, 56));
         System.out.println(useValidator(validateToo::test, 56));
         System.out.println(useValidator(CatVa::validate, 56));    }
    public static boolean useValidator(DoubleValidator doubleValidator, double d) {
        return doubleValidator.test(d);    }}
class CatVa {
    public static boolean validate(double b) {
        return b < 50;    }}
interface DoubleValidator extends Predicate<Double> {}
interface OtherDoubleValidator extends Predicate<Double> {}
class DoubleNotOver10Validator implements DoubleValidator {
    @Override    public boolean test(Double aDouble) {
        return aDouble <= 10;    }}

