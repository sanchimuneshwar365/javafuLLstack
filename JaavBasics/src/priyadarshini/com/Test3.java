package priyadarshini.com;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set<String> emails = new HashSet<>();
		emails.add("user1@gmail.com");
		emails.add("user2@gmail.com");
		emails.add("user1@gmail.com");                      // Duplicate 
		System.out.println("Registered emails");
		for(String email : emails) {
			System.out.println(email);
		}
		
	}

}
