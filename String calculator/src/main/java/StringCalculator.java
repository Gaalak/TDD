import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {
        String numbersWithoutLine = numbers.replace(";","\n").replace("\n", ",");
        String[] rowValues = numbersWithoutLine.split(",");
        int lengthValue = rowValues.length;
        int i = 0;
        int nb = 0;
        if (numbers.contains(",")) {
            try{

                for (i = 0; i < lengthValue; i++) {

                    nb += Integer.parseInt(rowValues[i].trim());

                }

            } catch (NumberFormatException e){
                throw new RuntimeException(numbers);
            }
            return nb;
        } else if (!numbers.equals(" ")) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
