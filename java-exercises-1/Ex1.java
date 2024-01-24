/* Make a program to read two integer values, and then show on the screen the sum of those numbers with an explanatory message, as examples. */

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, sum;

        System.out.println("Enter the value of A:");
        A = sc.nextInt();

        System.out.println("Enter the value of B:");
        B = sc.nextInt();

        sum = A + B;
        System.out.println("SUM = " + sum);
        sc.close();
    }
}
