package String;

public class Count {
	public static void main(String[] args) {
		String s = "I am Iron Man";
		
		String[] words = s.trim().split("\\s+");
		
		System.out.println("String: " + s);
		System.out.println("Number of words: " + words.length);
	}

}
