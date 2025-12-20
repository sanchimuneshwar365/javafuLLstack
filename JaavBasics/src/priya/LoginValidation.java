package priya;

import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {
		String storedUsername = "admin";
        String storedPassword = "12345";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Username: ");
        String inputUsername = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String inputPassword = sc.nextLine();
        
        if (inputUsername.equals(storedUsername) && 
        	inputPassword.equals(storedPassword)) {
        	
        	System.out.println("Login Successful");
        }
        else {
        	System.out.println("Login Failed");

        }
        	
        sc.close();
        }
	}