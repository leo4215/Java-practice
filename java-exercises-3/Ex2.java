/* Read an indeterminate amount of X and Y integer values. For each X and Y, display a message that indicates whether these values were typed in ascending or descending order. The reading should be terminated when equal values are given for X and Y. */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value for X and Y:");
        int x = sc.nextInt(), y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Descending");
            } else {
                System.out.println("Ascending");
            }

            System.out.println("Enter a new integer value for X and Y:");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
