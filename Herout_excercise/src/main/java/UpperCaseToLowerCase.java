import java.util.Scanner;

public class UpperCaseToLowerCase {

    //The user has entered three upper case characters into the terminal. The output is three lowercase letters.
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write three Upper case letters: ");

    String input = scanner.next();

        if (input.length() == 3) {
            for (int i = 0; i < 3; i++) {
                char upperCaseLetter = input.charAt(i);
                char lowerCaseLetter = Character.toLowerCase(upperCaseLetter);
            System.out.print(lowerCaseLetter);
        }
    } else {
        System.out.println("You must enter exactly three uppercase letters.");
    }
        scanner.close();
    }
}
