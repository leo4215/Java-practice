/* Read a value N. Calculate and write its respective factorial. Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1. Remember that, by definition, a factorial of 0 is 1. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt(), fac = 1;

        for (int i = 1; i <= n; i++){
            fac *= i;
        }

        System.out.println(fac);
        sc.close();
    }
}
