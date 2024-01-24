/* Read an integer value N (2 <= N < =1000). Then, display the times table of N:
1 x N = N
2 x N = 2N
3 x N = 3N
...
10 x N = 10N
*/

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer from 2 to 1000:");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mlt = i * n;
            System.out.printf("%d x %d = %d%n", i, n, mlt);
        }
        sc.close();
    }
}
