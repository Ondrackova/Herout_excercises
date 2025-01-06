import java.util.Scanner;

public class HexadecimalToDecadeNumber {

    //The user has entered two characters in scope 0-9 and A-F into the terminal.
    // The output is decade number.
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number in the range 0-9: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Invalid number! Must be in the range 0-9.");
            return;
        }

        System.out.print("Write a character in the range A-F: ");
        String character = scanner.next().toUpperCase();

        if (character.length() != 1 || character.charAt(0) < 'A' || character.charAt(0) > 'F') {
            System.out.println("Invalid character! Must be a single character in the range A-F.");
            return;
        }

        String hexValue = number + character;

        // Convert the hexadecimal string to a decimal integer
        int decimalValue = Integer.parseInt(hexValue, 16);

        // Print the result
        System.out.println("The value in the decimal system: " + decimalValue);
    }

}
