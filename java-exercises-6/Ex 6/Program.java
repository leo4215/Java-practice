/* Make a program that reads N integers and stores them in an array. Then display on the screen all the even numbers, and also the amount of even numbers. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers are you entering? ");
        int even = 0, n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0 ; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nEVEN NUMBERS: ");
        for (int i : vect){
            if (i % 2 == 0){
                System.out.printf("%d ", i);
                even++;
            }
        }
        
        System.out.printf("%n\nEVEN NUMBERS QUANTITY: %d", even);
        sc.close();
    }
}
