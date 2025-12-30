package Inheritance;

public class ParentApp {
	public static void main(String[] args) {
		Child c=new Child(100,99);
		System.out.println(c.a+" "+c.b);
	}
}
class Parent {
	int a;
	int b;
	public Parent(){
		this(99,99);
		a=10;
		b=20;
		System.out.println("zero parametrize parent");
	}
	public Parent(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("2  parametrize parent");
	}
}
class Child extends Parent{
	public Child() {
		a=30;
		b=40;
		System.out.println("zero parametrize chid");
		
	}
	public Child(int a,int b) {
		this();
		this.a=a;
		this.b=b;
		System.out.println("2  parametrize child");
	}
}
