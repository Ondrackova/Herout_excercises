import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a character: ");
        char inputChar = scanner.next().charAt(0);

        char nextChar = (char) (inputChar + 1);

        System.out.println("Next character is: " + nextChar);

        scanner.close();
    }
}
