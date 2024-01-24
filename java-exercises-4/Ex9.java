/* Read two integer values X and Y. Then, calculate and display the sum of the odd numbers between X and Y. */

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer X and Y:");
        int x = sc.nextInt(), y = sc.nextInt(), min, max, sum = 0;

        if (x > y) {
            min = y;
            max = x;
        } else {
            min = x;
            max = y;
        }
        
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
