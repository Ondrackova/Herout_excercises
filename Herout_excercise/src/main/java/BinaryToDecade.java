import java.util.Scanner;

public class BinaryToDecade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number and use only zeros and ones:");
        String binaryInput = scanner.nextLine();

        boolean isBinary = true;
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) != '0' && binaryInput.charAt(i) != '1') {
                isBinary = false;
                break;
            }
        }
        if (!isBinary) {
            System.out.println("Only numbers containing 0 and 1 are allowed. Please try again.");
        } else {
            long decimalNumber = Long.parseLong(binaryInput, 2);
            System.out.println("Conversion to decimal number: " + decimalNumber);
        }
    }
}
;