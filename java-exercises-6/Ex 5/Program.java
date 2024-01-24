/* Make a program to read name, age, and height of N people. Then, show on the screen the average height of people, and also show the percentage of people under the age of 16, as well as the names of those people, if any. */

package application;

import java.util.Scanner;

import entities.People;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int minors = 0, n = sc.nextInt();

        People[] vect = new People[n];
        double sum = 0, avg;

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Person %d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);
        }

        for (People i : vect){
            sum += i.getHeight();
            if (i.getAge() < 16){
                minors++;
            }
        }
        avg = sum / vect.length;
        double percentage = (double) minors / vect.length * 100;
        
        System.out.printf("\nAverage height: %.2f\n", avg);
        System.out.println("People younger than 16 years old: " + percentage + "%");
        for (People i : vect){ 
            if (i.getAge() < 16){
                System.out.println(i.getName());
            }
        }
        sc.close();
    }
}
