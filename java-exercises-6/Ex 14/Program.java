/* The owner of a boarding house has ten rooms for rent to students, these rooms being identified by the numbers 0 to 9.

Make a program that starts with all ten rooms empty, and then reads an amount N representing the number of students who are going to rent rooms (N can be from 1 to 10). Next, record the rent of the N students. For each rental record, inform the student's name and email, as well as which of the rooms was chosen (from 0 to 9). Suppose an available room is chosen. At the end, your program should print a report of all occupancies in the boarding house, in order of room. */

package application;

import java.util.Scanner;

import entities.Rent;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        Rent[] vect = new Rent[10];
        
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
