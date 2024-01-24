/* Make a program to read two arrays A and B, containing N elements each. Next, generate a third arrays C where each element of C is the sum of the corresponding elements of A and B. Print the generated array C. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter the values for vector A:");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter the values for vector B:");
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("RESULTING VECTOR:");
        for (int i : c){
            System.out.printf("%d\n", i);
        }

        sc.close();
    }
}
