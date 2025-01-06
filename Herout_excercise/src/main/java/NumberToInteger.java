import java.util.Scanner;

public class NumberToInteger {

    // The user has entered number into the terminal. The output is whole number (integer).
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Write some number: ");
                number = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
            }
        }
        int intNumber = (int) Math.floor(number);

        System.out.println("The integer part is: " + intNumber);
        scanner.close();
    }
}
