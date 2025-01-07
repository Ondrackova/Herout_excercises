import java.util.Scanner;

public class PrimaryNumber {

    public boolean isPrimaryNumber (int i) {
        if (i <= 1) {
            return false;
        }

        for (int div = 2; div <= Math.sqrt(i); div++) {
            if (i % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimaryNumber primaryNumber = new PrimaryNumber();

        System.out.println("Write a number: ");
        int input = scanner.nextInt();

        System.out.println("The number is primary number: " + primaryNumber.isPrimaryNumber(input));
    }
}

