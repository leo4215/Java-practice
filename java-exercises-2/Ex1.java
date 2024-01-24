/* Make a program to read an integer, and then tell you if this number is negative or not. */

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("NON NEGATIVE");
        }

        sc.close();
    }
}
