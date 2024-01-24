/*Read 2 values with one decimal place (x and y), which should represent the coordinates of a point on a plane. Next, determine which quadrant the point, or if it is on one of the Cartesian axes or at the origin (x = y = 0). If the dot is at the source, type the message "Origin". If the point is on one of the axes, write "X-axis" or "Y-axis", depending on the situation. */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the value of X:");
        double X = sc.nextDouble();
        System.out.println("Enter the value of Y:");
        double Y = sc.nextDouble();

        if (X > 0 && Y > 0){
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origin");
        }
        sc.close();
    }
}
