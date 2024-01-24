/* You have a dataset containing the height and gender (M, F) of N people. Make a program that calculates and writes the highest and lowest height of the group, the average height of the women, and the number of men. */

package application;

import java.util.Scanner;

import entities.People;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int n = sc.nextInt(), menQtt = 0, womenQtt = 0;
        
        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++){
            System.out.printf("Height of person %d: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Gender of person %d: ", i + 1);
            char gender = sc.next().charAt(0);
            vect[i] = new People(height, gender);
        }
        
        double minHeight = vect[0].getHeight(), maxHeight = vect[0].getHeight(), sum = 0;
        for (People i : vect){
            if (i.getHeight() < minHeight){
                minHeight = i.getHeight();
            }
            if (i.getHeight() > maxHeight){
                maxHeight = i.getHeight();
            }
            if (i.getGender() == 'M'){
                menQtt++;
            } else {
                sum += i.getHeight();
                womenQtt++;
            }
        }
        double avg = sum / womenQtt;
        
        System.out.printf("Shortest height = %.2f\n", minHeight);
        System.out.printf("Tallest height = %.2f\n", maxHeight);
        System.out.printf("Average women height = %.2f\n", avg);
        System.out.printf("Quantity of men = %d\n", menQtt);
        sc.close();
    }
}
