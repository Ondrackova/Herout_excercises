
public class Power {

    //table of power x from 1 to n
    public static void power (double x, int n) {

        for (int i=1; i<n; i++){
            System.out.println(x + " ^ " + i + " = " + (int)Math.pow(x, i));
        }
    }
    public static void main(String[] args) {

        power(2, 10);
    }
}
