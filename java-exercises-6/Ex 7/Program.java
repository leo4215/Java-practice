/* Make a program that reads N integers and stores them in an array. Then show the largest number of the vector on the screen (assume there are no ties). Also show the position of the largest element, considering the first position as 0 (zero). */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number are you digiting? ");
        int index = 0, n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digit a number: ");
            vect[i] = sc.nextDouble();
        }

        double maxValue = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] > maxValue){
                maxValue = vect[i];
                index = i;
            }
        }

        System.out.printf("\nHIGHEST VALUE = %.2f\n", maxValue);
        System.out.printf("HIGHEST VALUE POSITION = %d", index);
        sc.close();
    }
}
