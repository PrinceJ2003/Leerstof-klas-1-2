import java.util.Arrays;

public class StringCalculator {
    public static int calculate(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split("[,\n]");
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                negatives.append(number).append(",");
            } else if (num <= 1000) {
                sum += num;
            }
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("Kan niet negatief zijn: " + negatives.substring(0, negatives.length() - 1));
        }

        return sum;
    }
}
