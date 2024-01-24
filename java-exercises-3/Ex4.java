/* Write a program that repeats reading a password until it is valid. For each incorrect password, write the message "Invalid Password". When the password is entered correctly, the message "Access allowed" should be printed and the algorithm terminated. Consider that the correct password is the value 2002. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password:");
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password.");
            System.out.println("");
            System.out.println("Enter password:");
            password = sc.nextInt();
        }

        System.out.println("Access allowed.");
        sc.close();
    }
}
