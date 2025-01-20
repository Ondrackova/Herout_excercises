import java.util.Scanner;

public class IntegerToBinary {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a whole number: ");
        String strNumber = scanner.next();

        if (strNumber.contains(".") || strNumber.contains(",")) {
            System.out.println("Please write a whole number: ");
        }
        try {
            int intNumber = scanner.nextInt();
            String binaryNumber = Integer.toBinaryString(intNumber);
            System.out.println("Binary number is: " + binaryNumber);
        }catch (NumberFormatException e) {
            System.out.println("Please write a whole number: ");
        }

    }
}
