package com.PracticeQuestions20;
import java.util.scanner;
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		class ReverseInteger {
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int reverse = 0;

		        while (num != 0) {
		            int digit = num % 10;        // last digit
		            reverse = reverse * 10 + digit;
		            num = num / 10;              // remove last digit
		        }

		        System.out.println("Reverse number: " + reverse);
		    }
		}


	}

}
