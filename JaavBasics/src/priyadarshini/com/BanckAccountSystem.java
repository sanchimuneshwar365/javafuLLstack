package priyadarshini.com;
import java.util.Map;
import java.util.HashMap;

public class BanckAccountSystem {
	public static void main(String[] args) {
		
Map<Integer,String> accounts = new HashMap<>();
		
		accounts.put(1001, "Ravi");
		accounts.put(1002,  "Sneha");
		accounts.put(1003, "Imran");
		
		System.out.println("Account Details:");
		for (Map.Entry<Integer, String> entry: accounts.entrySet()) {
			System.out.println("Account No: "+ entry.getKey()+ "Name:" + entry.getValue());
		}
		
		System.out.println("\nAccount Holder for 1002:"+ accounts.get(1002));
				
	}
	

}
