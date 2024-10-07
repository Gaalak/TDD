package Java.Fonction.Exo1;

public class CalculatorFunctionV2 {

    final int nb1;
    final int nb2;
    final String operator;

    public static void main(String[] args) {
        CalculatorFunctionV2 addition = new CalculatorFunctionV2(1,10 , "+");
        CalculatorFunctionV2 multiplication = new CalculatorFunctionV2(3,30 , "*");
        CalculatorFunctionV2 division = new CalculatorFunctionV2(15,1 , "/");

    }
    public CalculatorFunctionV2(int nb1, int nb2, String operator) {
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.operator = operator;
        System.out.println(calculate());
    }

    private Integer calculate (){
        return switch (operator) {
            case "+" -> new Addition().apply(nb1,nb2);
            case "*" -> new Multiplication().apply(nb1,nb2);
            case "/" -> new Division().apply(nb1,nb2);
            default -> null;
        };
    }

}
