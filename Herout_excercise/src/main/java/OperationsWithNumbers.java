import java.util.Scanner;

public class OperationsWithNumbers {

    //The user has entered three numbers into the terminal. The output is the sum, product and average of these numbers. The minimum and maximum of them.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] threeNumbers = new int[3];

        System.out.println("Enter three numbers:");

        for (int i = 0; i < 3; i++) {
            threeNumbers[i] = scanner.nextInt();
        }

        int sum = threeNumbers[0] + threeNumbers[1] + threeNumbers[2];
        int product = threeNumbers[0] * threeNumbers[1] * threeNumbers[2];
        int average = sum / 3;

        int maxNumber = threeNumbers[0];
        int minNumber = threeNumbers[0];

        for (int num : threeNumbers) {
            if (num > maxNumber) {
                maxNumber = num;
            }
            if (num < minNumber) {
                minNumber = num;
            }
        }

        System.out.println("Sum of these numbers: " + sum);
        System.out.println("Product of these numbers: " + product);
        System.out.println("Average of these numbers: " + average);
        System.out.println("Mininum: " + minNumber);
        System.out.println("Maximum: " + maxNumber);

        scanner.close();
    }
}
