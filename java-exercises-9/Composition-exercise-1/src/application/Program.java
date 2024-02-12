package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts does this worker have? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contract #%d data:\n", i);
            sc.nextLine();
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            LocalDate contractDate = LocalDate.parse(date, fmt);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));
        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
    }
}