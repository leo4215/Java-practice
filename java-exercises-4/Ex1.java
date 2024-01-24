/* Read an integer value X (1 <= X <= 1000). Then show the odd ones from 1 to X, one value per line, including the X, if applicable. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer between 1 and 1000:");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
