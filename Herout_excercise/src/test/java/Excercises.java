import org.junit.Test;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Float.NaN;
import static java.lang.Float.isInfinite;

public class Excercises {

    @Test
    public void dateTypeScope() {

        System.out.println("byte:");
        System.out.println(" Min value: " + Byte.MIN_VALUE);
        System.out.println(" Max value: " + Byte.MAX_VALUE);

        System.out.println("short:");
        System.out.println(" Min value: " + Short.MIN_VALUE);
        System.out.println(" Max value: " + Short.MAX_VALUE);

        System.out.println("int:");
        System.out.println(" Min value: " + Integer.MIN_VALUE);
        System.out.println(" Max value: " + Integer.MAX_VALUE);

        System.out.println("long:");
        System.out.println(" Min value: " + Long.MIN_VALUE);
        System.out.println(" Max value: " + Long.MAX_VALUE);
    }

    @Test
    public void dataTypeScopeReal() {

        System.out.println("float:");
        System.out.println(" Min value: " + Float.MIN_VALUE);
        System.out.println(" Min value: " + Float.MAX_VALUE);

        System.out.println("double:");
        System.out.println(" Min value: " + Double.MIN_VALUE);
        System.out.println(" Min value: " + Double.MAX_VALUE);
    }

     @Test
     public void beepProgram() {
         Toolkit.getDefaultToolkit().beep();
     }

    @Test
    public void numberPi() {
        double d = Math.PI;
        String numberCentines = String.format("%.2f", d);
        System.out.println("Number PI: " + numberCentines);
    }
}
