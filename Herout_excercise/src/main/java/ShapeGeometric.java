import java.util.Scanner;

public class ShapeGeometric {

    //Write count of rows, columns and which symbol can be used. The output is square or rectangle.
    public static void main (String[] args){

        int rows;
        int columns;
        String symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write count of rows:");
        rows = scanner.nextInt();
        System.out.println("Write count of columns:");
        columns = scanner.nextInt();
        System.out.println("Write a symbol:");
        symbol = scanner.next();

        for (int i = 1; i<= rows; i++ ){
            System.out.println();
            for (int j = 1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}
