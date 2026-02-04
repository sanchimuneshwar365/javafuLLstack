package com.PracticeQuestions;
import java.util.Scanner;
public class DistinctArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------Enetr Array Size----------");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("----------Enter Array Elements----------");
		
		for (int i = 0; i < n; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("----------Distinct Array Elements----------");
		for (int i = 0; i < n; i++) {
			 boolean isDistinct = true;
			 
			 for (int j = 0; j < i; j++) {
				 if (a[i] == a[j]) {
					 isDistinct = false;
	                    break;
				 }
				 
			 }
			 if (isDistinct) {
	                System.out.print(a[i] + " ");
			 
		}

	}

	}
}

