/* Make a program that reads a positive integer N (maximum = 10) and then N integers and store them in an array. Then display on the screen all the negative numbers read. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers are you entering? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");
        for (int i : vect){
            if (i < 0){
                System.out.printf("%d\n", i);
            }
        }
        sc.close();
    }
}
