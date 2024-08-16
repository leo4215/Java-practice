package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.entities.Employee;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        String file = "c:\\users\\leona\\desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

            System.out.println("Most expensive:");
            double highestSalary = list.get(0).getSalary();
            for (Employee emp : list) {
                if (emp.getSalary() > highestSalary) {
                    highestSalary = emp.getSalary();
                }
            }
            System.out.println(highestSalary);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}