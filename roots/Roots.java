package roots;

import java.util.Scanner;
import java.lang.Math;

public class Roots {
    public static void main(String[] args) {
        int a, b, c, dSquare;
        double d, x1, x2;
        System.out.println("Program to calculate roots of a quadratic equation ax^2 + bx + c = 0");
        System.out.println("Enter the values of a, b and c ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        dSquare = b * b - (4 * a * c);
        d = Math.sqrt(dSquare);
        if (dSquare >= 0) {
            System.out.println("Determinant greater tha equal to 0 ");
            x1 = ((-b) + d) / (2 * a);
            x2 = ((-b) - d) / (2 * a);
            System.out.println("Roots are " + x1 + ", " + x2);
        } else {
            System.out.println("Determinant less than 0, Roots are Imaginary");
        }

    }
}
