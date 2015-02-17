import java.io.IOException;

/**
 * Created by Степан on 15.02.2015.
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        int a=1;
        int b=22;
        int c=3;
        System.out.println("a = " + a + " b = " + b + " c = " + c);


        double d = (b * b) - (4 * a * c);

        System.out.println("Дискриминант = " + d);

        if(d < 0)
            System.out.print("Уравнение не имеет решений!!!");
        else
        if(d == 0) {
            double x1 = (-b) / (2 * a);
            System.out.println ("x = " + x1);
        }
        else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 == x2) {
                System.out.println ("x1 = x2 = " + x1);
            } else {
                System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
            }
        }

    }
}
