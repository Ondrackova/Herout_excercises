import java.util.Scanner;

public class EratosthenesPrimarySource {

    //Prime numbers from 1 to N, which is entered from console
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int N = scanner.nextInt();

        if (N < 2) {
            System.out.println("There are no primary numbers");
            return;
        }

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Primary numbers from 1 to " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
