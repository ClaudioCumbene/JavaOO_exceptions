package Aplication;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number= sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit= sc.nextDouble();
		
		Account ac = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount= sc.nextDouble();
		ac.withdraw(amount);
		System.out.println("New balance: "+ String.format("%.2f", ac.getBalance()) );
		
		sc.close();
	}
	
	

}
