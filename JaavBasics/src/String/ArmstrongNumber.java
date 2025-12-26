package String;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num = 153;
		int original = num;
		int sum = 0;
		
		while (num > 0) {
			int digit = num % 10;        // last Digit
			sum = sum + digit * digit * digit;
				num = num / 10;         // Remove last digit
		}
		
		if (sum == original) {
			System.out.println(original + "is an Armonstrong Number");
			
		}
		else
		{
			System.out.println(original + "is not an Armonstrong Number");
		}
	}
	

}
