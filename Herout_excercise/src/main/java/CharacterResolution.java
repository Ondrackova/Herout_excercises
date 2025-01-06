import java.util.Scanner;

public class CharacterResolution {

    // The user has entered character into the terminal.
    // The output is punctuation character or alphanumeric character.
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a character: ");
        String input = scanner.next();

        if (input.length() == 1) {
            char character = input.charAt(0);

            if (Character.isLetterOrDigit(character)) {
                System.out.println("Alphanumeric character");
            } else {
                System.out.println("Punctuation character");
            }
        } else {
            System.out.println("Please enter a single character.");
        }

        scanner.close();
    }
}
