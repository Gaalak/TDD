import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {
        String numbersWithoutLine = numbers.replaceAll("\n", ",");
        String[] rowValues = numbersWithoutLine.split(",");
        int lengthValue = rowValues.length;
        int i = 0;
        int nb = 0;
        if (numbers.contains(",")) {
            if (Pattern.compile("A").matcher(numbers).find()) {
            throw new RuntimeException(numbers);
            } else {
                for (i = 0; i < lengthValue; i++) {

                    nb += Integer.parseInt(rowValues[i].trim());

                }
                return nb;
            }
        } else if (!numbers.equals(" ")) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
