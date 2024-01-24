/*Make a program that reads integers until a zero is read. At the end, display the sum of the numbers read.*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1, sum = 0;

        while (num != 0) {
            System.out.println("Enter any integer:");
            num = sc.nextInt();
            sum += num;
        }

        System.out.printf("The sum is: %d", sum);
        sc.close();
    }
}
