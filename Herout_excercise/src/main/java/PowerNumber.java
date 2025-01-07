public class PowerNumber {
    static double power (double x, int n) {
       return x * Math.pow(x,(n-1));
    }

    public static void main (String[] args) {
        int a = 2;
        int b = 4;
        double output = power(a, b);
        System.out.println(a + "^" + b + "=" + output);
    }
}

