package day6;
import java.util.*;

public class CompareString{
	public static void main(String[] args) {
		String s1 = "Arsh";
		String s2 = "Arsh";
		
		if(s1 == s2) {
			System.out.println("References are equal");
			
		}
		else {
			System.out.println("References are not equal");
			
		}
		if(s1.equals(s2)) {
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}
	}

}
