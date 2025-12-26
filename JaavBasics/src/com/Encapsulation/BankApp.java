package com.Encapsulation;
import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter amount to deposit");
		Bank b=new Bank();
		b.balance=sc.nextInt();
		System.out.println("Your current balance : "+b.balance);
		
		System.out.println("please enter amount to withdraw");
		int w=sc.nextInt();
		b.balance=b.balance-w;
		System.out.println("Your current balance : "+b.balance);
		
	}

}
class Bank{
	public int balance;
}