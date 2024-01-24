/* Make a program to read an integer N and then the data (id, name, and salary) of N employees. There should be no repetition of id.

Then, increase X percent in the salary of a particular employee. To do this, the program must read an id and the value X. If the id entered does not exist, show a message and abort the operation. At the end, display the updated list of employees.

Remember that a salary can only be increased on the basis of a given percentage increase operation. */

package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will you enter? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already exists! Enter another one: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have a salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
