package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthdate = LocalDate.parse(sc.next(), fmt);
        Client client = new Client(clientName, clientEmail, birthdate);
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(sc.next()), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            System.out.printf("Enter #%d item data:\n", i);
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            OrderItem it = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);
         
        sc.close();
    }
}