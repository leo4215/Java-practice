/* Make a program to read three integers and show the greatest one on the screen. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int higher = higherNumber(a, b, c);
        showResult(higher);
        sc.close();
    }

    public static int higherNumber(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public static void showResult(int aux) {
        System.out.println("The higher number is: " + aux);
    }
}
