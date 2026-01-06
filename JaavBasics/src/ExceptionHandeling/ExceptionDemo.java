package ExceptionHandeling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Connection established");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2 to divide");
		int b=sc.nextInt();
		try { 
			int c=a/b;
			System.out.println("c");
		} catch (Exception e) { 
		System.out.println("exception handled ");
		}
		System.out.println("connection terminated");
		
	}

}
