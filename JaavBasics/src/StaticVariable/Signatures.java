package StaticVariable;

public class Signatures {
	final synchronized public static void main(String...args) {
		System.out.println("Hello");
	}
public static void main(int[] args) {
	System.out.println("main accepting integer type array");
}
public static void main() {
	System.out.println("Main method accepting any argument");
}
public static void main(char a) {
	System.out.println("Main method is accepting charcter input");
}
}

