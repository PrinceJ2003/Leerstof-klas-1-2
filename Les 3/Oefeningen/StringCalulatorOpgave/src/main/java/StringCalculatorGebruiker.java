import java.util.Arrays;
import java.util.Scanner;


public class StringCalculatorGebruiker {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een reeks getallen gescheiden door komma's of nieuwe regels in:");
        String input = scanner.nextLine();

        try {
            int result = calculator.calculate(input);
            System.out.println("De som van de getallen is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Fout: " + e.getMessage());
        }

        scanner.close();
    }
}