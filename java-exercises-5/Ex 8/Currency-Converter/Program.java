/* Make a program to read the dollar rate, and then an amount in dollars to be bought by a person in Brazilian reais. Display how many reais the person will pay for the dollars, considering that the person will have to pay 6% of IOF on the dollar amount. Create a CurrencyConverter class to be responsible for the calculations. */

package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollarPrice, amount));
        sc.close();
    }
}
