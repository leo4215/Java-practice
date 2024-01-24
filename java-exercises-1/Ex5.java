/* Make a program to read the code of a tool 1, the quantity of tools 1, the unit value of each tool 1, the code of tool 2, the quantity of tools 2, and the unit value of each tool 2. Calculate and show the amount to be paid. */

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, amount1, amount2;
        double price1, price2, total;

        System.out.print("Enter the code of the 1st tool: ");
        cod1 = sc.nextInt();
        System.out.print("Enter the amount of the 1st tool: ");
        amount1 = sc.nextInt();
        System.out.print("Enter the price of the 1st tool: ");
        price1 = sc.nextDouble();

        System.out.print("Enter the code of the 2nd tool: ");
        cod2 = sc.nextInt();
        System.out.print("Enter the amount of the 2nd tool: ");
        amount2 = sc.nextInt();
        System.out.print("Enter the price of the 2nd tool: ");
        price2 = sc.nextDouble();

        total = price1 * amount1 + price2 * amount2;

        System.out.printf("TOTAL: $ %.2f%n", total);

        sc.close();
    }
}
