/* Make a program that reads three double-precision floating-point values: A, B, and C. Then calculates and show:
   a) the area of the right-angled triangle that has A for base and C for height.
   b) the area of the circle of radius C. (pi = 3.14159)
   c) the area of the trapezoid that has A and B for bases and C for height.
   d) the area of the square that has side B.
   e) the area of the rectangle that has sides A and B. */

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezoid, square, rectangle;

        System.out.print("Enter the value of A: ");
        A = sc.nextDouble();
        System.out.print("Enter the value of B: ");
        B = sc.nextDouble();
        System.out.print("Enter the value of C: ");
        C = sc.nextDouble();

        triangle = A * C / 2;
        circle = 3.14159 * Math.pow(C, 2);
        trapezoid = (A + B) / 2 * C;
        square = Math.pow(B, 2);
        rectangle = A * B;

        System.out.printf("TRIANGLE: %.3f%n", triangle);
        System.out.printf("CIRCLE: %.3f%n", circle);
        System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}
