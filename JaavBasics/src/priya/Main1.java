package priya;

import java.util.Scanner;

interface Payment {
	void pay(double amt);

}
abstract class Onlinepayment{
	
	void generateReceit() {
		System.out.println("Receipt generated succesfully");
		
		
	}
}
class Creditcard extends Onlinepayment implements Payment{

	@Override
	public void pay(double amt) {
		System.out.println("Payment of "+amt+"done using online payment");
	}
	
}
class Upi extends Onlinepayment implements Payment{

	@Override
	public void pay(double amt) {
		System.out.println("Payment of"+amt+"done using UPI payment");
	}
	
}
class Main1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter payment amount and payment method"
				+ "\n enter 1:Creditcard\n 2:UPI");
	Double amt=sc.nextDouble();
		int a=sc.nextInt();
		if(a==1) {
			Creditcard obj=new Creditcard();
			obj.pay(amt);
			obj.generateReceit();
		}
		else {
			Upi obj1=new Upi();
			obj1.pay(amt);
			obj1.generateReceit();
			
		}sc.close();
	}
}
