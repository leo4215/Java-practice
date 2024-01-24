/* Make a programm to read a numbre N. Then read N pairs of numbers and show the division of the first by the second. If the denominator is equal to zero, show the message "impossible division". */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of divisions that will be calculated:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the pairs of numbers:");
            int a = sc.nextInt(), b = sc.nextInt();

            if (b != 0) {
                double div = (double) a / b;
                System.out.printf("%.1f%n", div);
            } else {
                System.out.println("Impossible division");
            }
        }
        
        sc.close();
    }
}

