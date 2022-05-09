import java.util.AbstractList;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String numbers) {
        int i;
        int nb = 0;
//        int indexNeg;
        int index;
        if (numbers.equals(" ")) {
            System.out.println(numbers);
            return 0;
        } else if (!numbers.contains("\n") || numbers.contains(",")) {
            String numbersWithoutLine = numbers.replace("\n", ",");
            String[] rowValues = numbersWithoutLine.split(",");
            int lengthValue = rowValues.length;
            try {
                for (i = 0; i < lengthValue; i++) {
                    nb += Integer.parseInt(rowValues[i].trim());
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(numbers);
            }
            return nb;
        } else {
            index = numbers.indexOf("\n");
//            indexNeg = numbers.indexOf("-");
//            String negativeNumber = numbers.substring(indexNeg, 1);
            String delimiter = numbers.substring(0, index);
            if (numbers.substring(0, index).contains(delimiter)) {
                String numbersWithoutFirstSeparator = numbers.replaceFirst(delimiter, "");
                String[] rowValues = numbersWithoutFirstSeparator.split(delimiter);
                int lengthValue = rowValues.length;
                try {
                    for (i = 0; i < lengthValue; i++) {
                        nb += Integer.parseInt(rowValues[i].trim());
                    }
                } catch (NumberFormatException e) {
                    throw new RuntimeException(nb + "");
                }
//                if (!negativeNumber.isEmpty()){
//                    Integer[] tabNegNumber = add(4);
//                }
                return nb;
            }
            return Integer.parseInt(numbers);
        }
    }
}
