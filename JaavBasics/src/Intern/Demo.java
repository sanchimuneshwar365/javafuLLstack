package Intern;
public class Demo {
	public static void main(String[] args) {
		String s1 = new String("Deep");
		String s2 = s1.intern();
		String s3 = s1.intern();
		if(s2 == s3) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
	}
	

}
