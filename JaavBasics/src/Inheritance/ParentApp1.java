package Inheritance;

public class ParentApp1 {
	public static void main(String[] args) {
		childA c=new childA();
		c.disp();
	}

}
class ParentA{
	public void disp() {
		System.out.println("this is parent method");
	}
}
class childA extends ParentA{
	public void disp() {
		System.out.println("this is child method");
	}
}