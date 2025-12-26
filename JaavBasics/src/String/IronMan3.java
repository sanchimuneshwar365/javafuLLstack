package String;

public class IronMan3 {
		public static void main(String[] args) {
			String s = "man Iron am I";
			String reverse = "";
			
			for( int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
				
			}
			System.out.println("Original String: " + s);
			System.out.println("Reverse String: " + reverse);
			
		
		}

	}


                                                         
