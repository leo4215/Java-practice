/* Make a program to read a set of N student names as well as the grades they took in the 1st and 2nd semesters. Each of this information must be stored in an array. Then, print the names of the approved students, considering approved those whose average grades are greater than or equal to 6.0 (six). */

package application;

import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students are you entering? ");
        int n = sc.nextInt();

        Student[] vect = new Student[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Enter the name, the 1st and the 2nd grade of student %d:\n", i + 1);
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            vect[i] = new Student(name, grade1, grade2);
        }
        
        System.out.println("\nStudents that passed:");
        for (Student i : vect){
            double finalGrade = (i.getGrade1() + i.getGrade2()) / 2;
            if (finalGrade >= 6){
                System.out.printf("%s\n", i.getName());
            } 
        }
        sc.close();
    }
}
