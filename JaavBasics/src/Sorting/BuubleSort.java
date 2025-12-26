package Sorting;

public class BuubleSort {
	public static void main(String[] args) {
		
		int [] nums = {7,4,8,1,2};
		System.out.println("BEFORE SORTING");
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i =0;i<nums.length-1;i++) {
			for(int j =i+1;j<nums.length;j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] =  temp;
				}
			}
		}
		System.out.println("AFTER SORTING");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
			
		
	}

}
