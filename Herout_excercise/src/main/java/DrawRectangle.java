import java.util.Scanner;

public class DrawRectangle {

    // The user has entered two number as wight and height of rectangle into the terminal.
    // The output is a rectangle drawing.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a wight of rectangle: ");
        double input1 = scanner.nextInt();
        int width = (int) Math.floor(input1);

        System.out.println("Write a height of rectangle: ");
        double input2 = scanner.nextInt();
        int height = (int) Math.floor(input2);

        if (width <= 0 || height <= 0) {
            System.out.println("Please write a positive numbers.");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
