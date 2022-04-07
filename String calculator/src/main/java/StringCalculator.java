import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {
        String[] rowValues = numbers.split(",");
        int lengthValue = rowValues.length;
        if (numbers.contains(",")) {
            if (Pattern.compile("A").matcher(numbers).find()) {
                 throw new RuntimeException(numbers);
            } else {
                for (int i = 0; i < lengthValue; i++) {
                    int nb = Integer.parseInt(rowValues[i]);
                    System.out.println(i);
                    System.out.println(lengthValue);
                    nb += nb;
                    return nb;

                }
            }
        } else if (!numbers.equals(" ")) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
