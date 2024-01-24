/* Make a program that reads any value and displays a message saying in which of the following intervals ([0.25], (25.50), (50.75), (75.100]) this value is found. Obviously, if the value is not in any of these ranges, the message "Out of range" should be printed. */

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a double value:");
        double num = sc.nextDouble();

        if (num < 0.0 || num > 100.0) {
            System.out.println("Out of range");
        } else if (num <= 25.0) {
            System.out.println("Interval [0,25]");
        } else if (num <= 50.0) {
            System.out.println("Interval (25,50]");
        } else if (num <= 75.0) {
            System.out.println("Interval (50,75]");
        } else {
            System.out.println("Interval (75,100]");
        }

        sc.close();
    }
}
