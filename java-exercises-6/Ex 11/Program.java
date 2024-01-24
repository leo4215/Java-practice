/* Make a program to read a set of people's names and their respective ages. Names should be stored in one array, and ages in another array. Then, display the older person's name. */

package application;

import java.util.Scanner;

import entities.People;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int index = 0, n = sc.nextInt();

        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Person %d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            vect[i] = new People(name, age);
        }

        int maxAge = vect[0].getAge();
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() > maxAge){
                maxAge = vect[i].getAge();
                index = i;
            }
        }

        System.out.printf("OLDEST PERSON: " + vect[index].getName());
        sc.close();
    }
}
