import java.util.Scanner;

public class DPHCalculator {

    //The user has entered number as a price into the terminal. The output is price with DPH.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a price without DPH: ");
        double price = scanner.nextDouble();
        double tax = price * 0.25;
        double totalPrice = price + tax;

        System.out.printf("Price without DPH: %.2f Kč\n", price);
        System.out.printf("Amount DPH: %.2f Kč\n", tax);
        System.out.printf("Cost including DPH: %.2f Kč\n", totalPrice);

        scanner.close();
    }
}
