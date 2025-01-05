import java.util.Scanner;

public class DPHCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a price without DPH: ");
        double price = scanner.nextDouble();
        double tax = price * 0.25;
        double totalPrice = price + tax;

        System.out.println("Price without DPH: " + price);
        System.out.println("Amount DPH (25%): " + tax);
        System.out.println("Cost including DPH: " + totalPrice);

        scanner.close();
    }
}
