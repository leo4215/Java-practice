/* Make a program to read four integer values A, B, C, and D. Next, calculate and show the difference of the product of A and B by the product of C and D according to the formula: DIFFERENCE = (A * B - C * D). */

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, dif;

        System.out.println("Enter the value of A:");
        A = sc.nextInt();
        System.out.println("Enter the value of B:");
        B = sc.nextInt();
        System.out.println("Enter the value of C:");
        C = sc.nextInt();
        System.out.println("Enter the value of D:");
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFFERENCE = " + dif);

        sc.close();
    }
}
