package priya;

import java.util.Scanner;

public class Account {
	static String bankName = "State Bank of India";
	static double interestRate = 4.5;
	
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	final String Account_Rule = "Minimum balance must be maintained";
	
	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void displayAccountInfo() {
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("account Holder Name: " + accountHolderName);
		System.out.println("Balance:" + balance);
			

		}
		
		
	}
        
	
}

