/* Find largest and smallest elements of an array. */ 

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements are you entering? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        
        System.out.print("Enter element 1: ");
        vect[0] = sc.nextInt();
        int largest = vect[0], smallest = vect[0];

        for (int i = 1; i < vect.length; i++){
            System.out.printf("Enter element %d: ", i + 1);
            vect[i] = sc.nextInt();
            if (vect[i] > largest){
                largest = vect[i];
            } 
            if (vect[i] < smallest){
                smallest = vect[i];
            }
        }
        
        System.out.printf("The largest element of the arrray is %d and the smallest is %d.", largest, smallest);
        sc.close();
    }
}
