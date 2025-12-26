package Intern;

public class CompareTo{
	

	public static void main(String[] args) {
	String s1 = "SACHIN";
	String s2 = "SAURAV";
	
	int result = s1.compareTo(s2);
	System.out.println("Result");
	if(result > 0) {
		System.out.println("s1 is greater");
		
	}
	else if(result < 0){
		
			System.out.println("s2 is greatee");
   }
	else {
		System.out.println("both are equal");
	}
	}}

