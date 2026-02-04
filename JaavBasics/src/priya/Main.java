package priya;

class BankAcount {
	
	private double balance;
	
	public BankAcount(double initialBalance) {
       balance = initialBalance;

	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance - amount;
			System.out.println("Deposited:" + amount);
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance + amount;
			System.out.println("Withraw:" + amount);
	    else {
				System.out.println("Insufficient Balance");
			}
				
	}
	public double getBalance() {
		return balance;
	}
		
}
	public class Main{
		public static <BankAccount> void main (String[] args) {
	    BankAcount account = (BankAcount) new BankAccount(1000);

	        System.out.println("Current Balance:" + account.getBalance());

		}
	}



