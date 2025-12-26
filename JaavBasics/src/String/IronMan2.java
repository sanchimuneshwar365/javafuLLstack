package String;


public class IronMan2 {
	public static void main(String[] args) {
		String s = "I ma norI nam";
		String reverse = "";
		
		for( int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
			
		}
		System.out.println("Original String: " + s);
		System.out.println("Reverse String: " + reverse);
		
	
	}

}
