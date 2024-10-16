package Java.Fonction.Exo1;

public class CalculatorFunctionV2 {

    final int nb1;
    final int nb2;
    final String operator;

    public static void main(String[] args) {
        Integer addition = new CalculatorFunctionV2("+")
                .apply(1, 10);
        Integer multiplication = new CalculatorFunctionV2("*")
                .apply(3, 30);
        Integer division = new CalculatorFunctionV2("/")
                .apply(15, 1);

    }
    public CalculatorFunctionV2(int nb1, int nb2, String operator) {
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.operator = operator;
    }

    private Operation calculate (String operator) {
        return switch (operator) {
            case "+" -> new Addition();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> null;
        };
    }

}
