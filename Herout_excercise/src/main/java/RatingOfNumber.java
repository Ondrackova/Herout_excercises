import java.util.Scanner;

public class RatingOfNumber {

    //The user has entered tho whole number into the terminal.
    // The output is a resolution of which number is small and which is larger.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter whole number: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        if (numbers[0] > numbers[1]) {
            System.out.println("Bigger number is: " + numbers[0]);
            System.out.println("Smaller number is: " + numbers[1]);
        } else if (numbers[0] < numbers[1]) {
            System.out.println("Bigger number is: " + numbers[1]);
            System.out.println("Smaller number is: " + numbers[0]);
        } else {
            System.out.println("Both numbers are equal: " + numbers[0]);
        }
    }
}



