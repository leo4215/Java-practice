/* Write a program to read the coordinates (X,Y) of an indeterminate number of points in the system Cartesian. For each point, write the quadrant to which it belongs. The algorithm will be terminated when at least one of two coordinates is zero (in this case, without writing any message). */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X and Y:");
        int x = sc.nextInt(), y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");
            } else if (x < 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }
            System.out.println("");
            System.out.println("Enter the value of X and Y:");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
