/* Make a program to read a temperature in Celsius and show the equivalent in Fahrenheit. Ask if the user wants to repeat (y/n). Formula: F = 9*c/5 + 32 */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char answer;
        do {
            System.out.println("Enter a Celsius temperature:");
            double c = sc.nextDouble(), f = (9 * c / 5) + 32;
            System.out.printf("The equivalent temperature in Fahrenheit is: %.1f%n", f);
            System.out.println("Do you want to repeat (y/n)?");
            answer = sc.next().charAt(0);
        } while (answer != 'n');

        sc.close();
    }
}
