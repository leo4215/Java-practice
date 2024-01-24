/*In an imaginary country called Lisarb, all the inhabitants are happy to pay their taxes, because they know that there are no corrupt politicians in it and the funds collected are used for the benefit of the population, without any deviation. The currency of this country is the Rombus, whose symbol is the R$.

Read a value of two decimal places, equivalent to a person's salary from Lisarb. Then, calculate and show the amount that this person must pay in Income Tax, according to the table below.

          Income                           Income Tax
- from 0.0 to R$ 2000.00                     Exempt
- from R$ 2000.00                             8%
- from R$ 3000.01 to R$ 4450.00               18%
- more than R$ 4450.00                        28%

Remember that, if the salary is R$ 3002.00, the rate that is levied is 8% only on R$ 1000.00, because the salary range that is from R$ 0.00 to R$ 2000.00 is exempt from income tax. The value should be printed to two decimal places.
 */

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary:");
        double tax, salary = sc.nextDouble();

        if (salary <= 2000.0) {
            tax = 0.0;
        } else if (salary <= 3000.0) {
            tax = (salary - 2000) * 0.08;
        } else if (salary <= 4500.0) {
            tax = (salary - 3000.0) * 0.18 + 80.0;
        } else {
            tax = (salary - 4500.0) * 0.28 + 350;
        }

        if (tax == 0) {
            System.out.println("Exempt");
        } else {
            System.out.printf("R$ %.2f", tax);
        }

        sc.close();
    }
}
