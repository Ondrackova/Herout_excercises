import java.util.Scanner;

public class RealDivision {

    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Write second number: ");
        double number2 = scanner.nextDouble();

        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else if (Double.isNaN(number1 / number2) || Double.isInfinite(number1 / number2)) {
            System.out.println("Error: The result is either NaN or Infinite!");
        } else {
            double result = number1 / number2;
            System.out.println("Result of division: " + result);
        }

        scanner.close();
    }
}
