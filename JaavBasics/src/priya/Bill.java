package priya;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Units Consumed");
		int units = sc.nextInt();
		int bill = 0;
		
		if (units <= 100) {
			bill = units * 3;
			
		}
		else if (units <= 200) {
			bill = (100* 3) + (units - 100) * 5;
		}
		else {
			bill = (100 * 3)+(100 * 5) + (units - 200) * 7;
			
		}
		
		System.out.println("Bill =" + bill); 
	}

}
