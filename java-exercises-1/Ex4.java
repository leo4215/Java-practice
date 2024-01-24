/* Make a program that reads an employee's ID number, their number of hours worked, the amount they get paid per hour, and calculates that employee's salary. Next, show the employee's ID and salary, with two decimal places. */

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID, hours;
        double wage, salary;

        System.out.print("Enter the employee ID: ");
        ID = sc.nextInt();
        System.out.print("Enter the amount of working hours: ");
        hours = sc.nextInt();
        System.out.print("Enter the employee wage: ");
        wage = sc.nextDouble();

        salary = wage * hours;

        System.out.println("ID = " + ID);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
