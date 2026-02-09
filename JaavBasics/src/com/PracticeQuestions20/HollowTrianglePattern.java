package com.PracticeQuestions20;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int sc.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<= n; j++) {
				
				
				if (j == 1 || j == i || i == n) {
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
