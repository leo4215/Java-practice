/* Read an integer value N. This value will be the number of integer values X that will be read next. Display how many of these X values are within the range [10,20] and how many are outside the range, showing this information as in the example below:

INPUT:  |   OUTPUT:
5       |   In: 2
14      |   Out: 3
123     |  
10      |  
-25     |
32      |
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of values that will be entered:");
        int n = sc.nextInt(), in = 0, out = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter an integer value:");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println("-----------------");
        System.out.printf("In: %d%n", in);
        System.out.printf("Out: %d", out);

        sc.close();
    }
}
