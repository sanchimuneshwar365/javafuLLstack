package ExceptionHandeling;

import java.util.Scanner;

	public class Account_main {
	    public static void main(String[] args) {
	        Bank1 obj = new Bank1();

	        try {
	            obj.accept_info();
	            obj.verified();
	        } catch (InvalidInputException e) {
	            System.out.println("Wrong pin");
	            System.out.println("Attempt 2");
	            try {
	                obj.accept_info();
	                obj.verified();
	            } catch (Exception ex) {
	                System.out.println("wrong pin");
	                System.out.println("Attempt 3");
	                try {
	                    obj.accept_info();
	                    obj.verified();
	                } catch (InvalidInputException exp) {
	                    System.out.println("your ATM is blocked 24hr");
	                }

	            }
	        }
	    }
	}

	class Bank1{
	    int acc=123456789;
	    String pass="Sanchi358";
	    Scanner sc=new Scanner(System.in);
	    int acc1;
	    String pass1;
	    void accept_info(){
	        System.out.println("Enter your account number");
	        acc1=sc.nextInt();
	        System.out.println("Enter your password");
	        pass1=sc.next();

	    }
	    void verified() throws InvalidInputException{
	        if(acc==acc1 && pass.equals(pass1)){
	            System.out.println("verified");
	        }
	        else{
	          //  System.out.println("not verified");
	            InvalidInputException obj1=new InvalidInputException();
	           // System.out.println( obj1.getMessage());
	            throw obj1;
	        }
	    }
	}
	class InvalidInputException extends Exception{
	    @Override
	    public String getMessage() {
	        return "Wrong credential";
	    }
	}

