/* Make a program to read a student's name and the three grades they earned in each of the three trimesters of the year (first trimester is worth 30 and second and third are worth 35 each). At the end, display the student's final grade for the year. Also display if the student is approved (PASS) or not (FAILED) and, if not, how many points are missing for the student to obtain the minimum to be approved (which is 60% of the grade). You must create a Student class to solve this problem. */

package application;

import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the student name, followed by his/her 1st, 2nd, and 3rd grade:");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.println(student);
        sc.close();
    }
}
