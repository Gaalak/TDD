import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {
        int i = 0;
        int nb = 0;
        if (!numbers.contains("\n") || numbers.contains(",")) {
            String numbersWithoutLine = numbers.replace("\n", ",");
            String[] rowValues = numbersWithoutLine.split(",");
            int lengthValue = rowValues.length;
            try {

                for (i = 0; i < lengthValue; i++) {

                    nb += Integer.parseInt(rowValues[i].trim());
                    System.out.println(nb + "nb");

                }

            } catch (NumberFormatException e) {
                throw new RuntimeException(numbers);
            }
            return nb;
        } else if (numbers.contains("\n")) {

            int index = numbers.indexOf("\n");
            String coucou = numbers.substring(0, index);

            if (numbers.substring(0, index).contains(coucou)) {

                String numbersWithoutFirstSeparator = numbers.replaceFirst(coucou, "");
                String[] rowValues = numbersWithoutFirstSeparator.split(coucou);

                int lengthValue = rowValues.length;

                try {

                    for (i = 0; i < lengthValue; i++) {
                        nb += Integer.parseInt(rowValues[i].trim());

                    }

                } catch (NumberFormatException e) {
                    throw new RuntimeException(nb + "");
                }
                return nb;
            } else if (numbers.equals(" ")) {

                return Integer.parseInt(numbers);
            }
            return 0;

        }
        return 0;
    }
}
