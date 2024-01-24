/* Make a program that reads N real numbers and stores them in an array. Then:
- Display all the array elements
- Display the sum and the average of the array elements */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers are you entering? ");
        int n = sc.nextInt();
        
        double sum = 0, avg;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("\nVALUES = ");
        for (double i : vect){
            System.out.printf("%.1f ", i);
            sum += i;
        }
        avg = sum / vect.length;

        System.out.printf("\nSUM = %.2f\n", sum);
        System.out.printf("AVERAGE = %.2f\n", avg);
        sc.close();
    }
}
