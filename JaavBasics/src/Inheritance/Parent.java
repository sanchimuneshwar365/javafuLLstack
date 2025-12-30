package Inheritance;

public class ParentApp{
	public static void main(String[] args) {
		child c = new child();
		System.out.println(1.0+" "+c.b);
		
	}
	
}
class parent{
	int a;
	int b;
	public parent() {
		a = 10;
		b = 20;
	}
	public parent (int a , int b) {
		this.a = a;
		this.b = b;
	}
}
class child extends parent{
	public child() {
		a = 30;
	}
}
