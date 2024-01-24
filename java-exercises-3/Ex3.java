/* Make a program to read an indeterminate number of data, each containing an individual's age. The last piece of data, which will not be included in the calculations, contains a negative age value. Calculate and print the average age of this group of individuals. If a negative value is entered the first time, display the message "Unable to calculate." */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = sc.nextInt(), sum = 0, count = 0;

        if (age < 0) {
            System.out.println("Unable to calculate.");
        } else {
            while (age >= 0) {
                sum += age;
                count++;
                System.out.println("Enter the age:");
                age = sc.nextInt();
            }
            double total = (double) sum / count;
            System.out.printf("The average age is: %.2f", total);
        }

        sc.close();
    }
}
