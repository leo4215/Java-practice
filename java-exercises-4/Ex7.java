/* Make a program to read a positive integer N. The program should then show N rows on the screen, starting from 1 to N. For each row, show the row number, then the square and the cube of the value, as in the example below: 

INPUT:  |   OUTPUT:
5       |   1 1 1
        |   2 4 8
        |   3 9 27
        |   4 16 64
        |   5 25 125
*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int n = sc.nextInt(), sqr, cub;

        for (int i = 1; i <= n; i++) {
            sqr = (int) Math.pow(i, 2);
            cub = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, sqr, cub);
        }
        sc.close();
    }
}
