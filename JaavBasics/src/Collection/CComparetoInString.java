package Collection;

public class CComparetoInString {
	public static void main(String[] args) {
		
		String s1 = new String("SACHIN");
		String s2 = new String("SAURAV");
		int res = s1.compareTo(s2);
		System.out.println(res);
		if(res>0) {
			System.out.println("s1 is greater");
			
		}
		else if (res<0) {
			System.out.println("s2 is greater");
		}
		else {
			System.out.println("both are equal");
		}
		
	}

}
