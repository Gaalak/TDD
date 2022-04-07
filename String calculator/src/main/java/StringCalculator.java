import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {

        if (numbers.contains(",")) {
            if (Pattern.compile("A").matcher(numbers).find()) {
                 throw new RuntimeException(numbers);
            } else {
                String[] rowValues = numbers.split(",");
                int nb1 = Integer.parseInt(rowValues[0].trim());
                int nb2 = Integer.parseInt(rowValues[1].trim());
//                int nb1 = Integer.parseInt(numbers.substring(0, 1));
//                int nb2 = Integer.parseInt(numbers.substring(2));
                return nb1 + nb2;
            }
        } else if (!numbers.equals(" ")) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
