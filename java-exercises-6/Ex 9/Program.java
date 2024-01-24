/* Make a program to read an integer N and then an array of N real numbers. Then display the arithmetic mean of all elements to three decimal places. Then display all the elements of the array that are below average, with one decimal place each. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();
        
        double[] vect = new double[n];
        double sum = 0, avg;
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        avg = sum / vect.length;
        System.out.printf("\nVECTOR AVERAGE = %.3f\n", avg);
        System.out.println("ELEMENTS UNDER THE AVERAGE:");
        for (double i : vect) {
            if (i < avg) {
                System.out.printf("%.1f\n", i);
            }
        }

        sc.close();
    }
}
