/* Make a program to read the value of the radius of a circle, and then show the value of the area of this circle with four decimal places as per examples.
   Area formula: area = π . radius^2
   Consider the value of π = 3.14159 */

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R, A, pi = 3.14159;

        System.out.println("Enter the value of the radius:");
        R = sc.nextDouble();

        A = pi * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
