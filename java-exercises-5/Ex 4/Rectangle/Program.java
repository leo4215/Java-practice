/* Make a program to read the values of the width and height of a rectangle. Then display on the screen the value of its area, perimeter and diagonal. Use a class as shown in the project below:

Rectangle
-Width: double
-Height: double

+Area(): double
+Perimeter(): double
+Diagonal(): double */

package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);
            
        sc.close();
    }
}
