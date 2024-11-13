package Java.Fonction.Exo1;

public class CalculatorFunctionV2 {


    public static void main(String[] args) {
        Integer addition =  calculate("+")
                .apply(1, 10);
        Integer multiplication =  calculate("*")
                .apply(3, 30);
        Integer division =  calculate("/")
                .apply(15, 1);

    }

    private static Operation calculate (String operator) {
        return switch (operator) {
            case "+" -> new Addition();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> null;
        };
    }

}
