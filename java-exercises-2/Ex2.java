/* Make a program to read an integer and tell you whether this number is odd or even. */

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        sc.close();
    }
}
