/* Make a program to read any numerical value, and then show how much would be the value of a circumference and the volume of a sphere for a radius of that value. Also, display the PI value with two decimal places.*/

package application;

import java.util.Scanner;
import util.Calculator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circunference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f", Calculator.PI);
        
        sc.close();
    }
}
