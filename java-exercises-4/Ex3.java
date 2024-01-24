/* Read 1 integer value N, which represents the number of test cases that come next. Each test case consists of 3 real values, each with one decimal place. Display the weighted average for each of these sets of 3 values. The first value has a weight of 2, the second value has a weight of 3, and the third value has a weight of 5. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of tests that will be entered:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter three real values:");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

            double average = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", average);
        }
        sc.close();
    }
}
