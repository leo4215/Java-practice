/* A gas station wants to determine which of its products is preferred by its customers. Write an algorithm to read the type of fuel filled (coded as follows: 1.Alcohol 2.Gasoline 3.Diesel 4.End). If the user enters an invalid code (outside the range of 1 to 4), a new code must be requested (until it is valid). The program will be terminated when the code entered is number 4. The message "THANK YOU" and the number of customers who filled up each type of fuel should be written. For example: 

INPUT:  |   OUTPUT:
8       |   THANK YOU
1       |   Alcohol: 1
7       |   Gasoline: 2
2       |   Diesel: 0
2       |
4       |
*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for alcohol, 2 for gasoline, 3 for diesel, and 4 to end the program.");
        System.out.println("Enter the type of fuel:");
        int fuel = sc.nextInt(), alcohol = 0, gasoline = 0, diesel = 0;

        while (fuel != 4) {
            if (fuel == 1) {
                alcohol++;
            } else if (fuel == 2) {
                gasoline++;
            } else if (fuel == 3) {
                diesel++;
            }

            System.out.println("Enter the type of fuel:");
            fuel = sc.nextInt();
        }

        System.out.println("THANK YOU");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
