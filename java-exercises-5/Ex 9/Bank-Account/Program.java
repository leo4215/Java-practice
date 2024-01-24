/* In a bank, to register a bank account, it is necessary to inform the account number, the name of the account holder, and the initial deposit amount that the holder deposited when opening the account. This initial deposit amount, however, is optional. If the holder has no money to deposit at the time of opening their account, The initial deposit will not be made and the initial account balance will of course be zero.

Important: Once a bank account has been opened, the account number can never be changed. On the other hand, the name of the holder can be changed (because a person can change their name on the occasion of a wedding, for example).

Finally, the account balance cannot be changed freely. There needs to be a mechanism to protect that. The balance only increases through deposits, and only decreases through withdrawals. For every withdrawal made, the bank charges a $5.00 fee. Note: The account may have a negative balance if the balance is not sufficient to make the withdrawal and/or pay the fee.

You must make a program that registers an account, giving you the option to enter the initial deposit amount or not. Then make a deposit and then a withdrawal, always displaying the account details after each operation. */

package application;

import java.util.Scanner;

import entities.Account;

public class Program{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
