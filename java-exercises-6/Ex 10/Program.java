/* Make a program to read an array of N integers. Then display the arithmetic mean of only the even numbers read, with one decimal place. If no even number is entered, show the message "NO EVEN NUMBERS" */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements will the vector have? ");
        int even = 0, n = sc.nextInt();

        int[] vect = new int[n];
        double sum = 0, avg;
        
        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                even++;
            }
        }
        
        if (even == 0){
            System.out.println("NO EVEN NUMBERS");
        } else {
            avg = sum / even;
            System.out.printf("EVEN NUMBERS AVERAGE = %.1f", avg);
        }
        sc.close();
    }
}
