/* Make a program to read an integer N and the data (name and price) of N products. Store the N products in an array. Then display the average price of the products. */

package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }
        
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}
