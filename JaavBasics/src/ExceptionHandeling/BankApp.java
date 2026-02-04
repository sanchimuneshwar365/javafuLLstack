package ExceptionHandeling;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.banking();
		
	}

}
class Bank{
	void banking() {
		System.out.println("Bank Connection is established");
		ATM Card=new ATM();
		try {
			Card.transaction();	
		} catch (Exception e) {
		System.out.println("info received by the bank your amount will");
		
	}
	
}
class ATM{
	void transaction() throws Exception {
		System.out.println("ATM Connection established");
		Scanner input=new Scanner(System.in);
		System.out.println("please Enter value1: ");
		int a=input.nextInt();
		System.out.println("Bank Enter value2: ");
		int b=input.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("exception handled by ATM");
			throw e;
		}
		finally {
		System.out.println("ATM connection terminated");
		input.close();
		
	    }
     }
}
}