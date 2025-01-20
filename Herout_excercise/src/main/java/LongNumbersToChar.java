import java.util.Scanner;

public class LongNumbersToChar {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a whole number of type long:");
        long number = scanner.nextLong();
        String  numberAsString = Long.toString(number);

        System.out.println("Digits in the number:");
        for (int i=0;i<numberAsString.length();i++){
           char numberAsChar = numberAsString.charAt(i);
           System.out.print(numberAsChar + "  ");
        }
    }
}
