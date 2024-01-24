/* Make a program to read the measurements of the sides of two triangles X and Y (assume valid measurements). Then show the value of the areas of the two triangles and say which of the two triangles has the larger area. The formula for calculating the area of a triangle from the measurements of its sides a, b, and c is the following (Heron's formula): Area = Square root of s(s - a)(s - b)(s - c) */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
