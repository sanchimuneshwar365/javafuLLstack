package MethodHidding;

public class Parent {
	static void disp() {
		System.out.println("this is parent method");
	}

}
class child extends Parent{
	static void disp() {
		System.out.println("this is child");
	}
}
class parentApp{
	public static void main(String[] args) {
		Parent p=new Parent();
		p.disp();
		child c=new child();
		c.disp();
		child p1=new child();
		p1.disp();		
	}
}
