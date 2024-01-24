/* Based on the table below, write a program that reads the code and the quantity of that item. Next, calculate and show the total.
   * CODE - PRODUCT - PRICE
   * 1    -   a     - $ 4.00
   * 2    -   b     - $ 4.50
   * 3    -   c     - $ 5.00
   * 4    -   d     - $ 2.00
   * 5    -   e     - $ 1.50
*/

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code:");
        int code = sc.nextInt();
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();

        double total = 0;

        if (code == 1) {
            total = amount * 4.0;
        } else if (code == 2) {
            total = amount * 4.5;
        } else if (code == 3) {
            total = amount * 5.0;
        } else if (code == 4) {
            total = amount * 2.0;
        } else if (code == 5) {
            total = amount * 1.5;
        } else {
            System.out.println("ERROR - code unrecognized");
        }

        System.out.printf("Total: $ %.2f%n", total);

        sc.close();
    }
}
