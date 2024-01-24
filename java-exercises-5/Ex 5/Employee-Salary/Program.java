/* Make a program to read an employee's data (name, gross salary, and tax). Then show the employee's details (name and net salary). Then, increase the employee's salary based on a given percentage (only the gross salary is affected by the percentage) and show the employee's data again. Use the class designed below.

Employee
-Name: String
-GrossSalary: double
-Tax: double

+NetSalary(): double
+IncreaseSalary(percentage: double): void */

package application;

import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
