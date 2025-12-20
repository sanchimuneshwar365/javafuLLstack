package priya;

import java.util.Scanner;

public class StudentGradeSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the student marks (0 - 100):");
		int Marks = sc.nextInt();
		
		if (Marks >= 90 && Marks <= 100) {
		   System.out.println("Grade A");
			
		}
		else if (Marks >= 75) {
		   System.out.println("Grade B");
			
		}
		else if (Marks >= 60) {
		   System.out.println("Grade C");
		}
		else if(Marks >= 0){
		   System.out.println("FAIL");
		   
		}
		else {
		  System.out.println("Invalid Marks");
		}
		
		sc.close();
			
	}


}
