package HasA;

public class AppParent {
	public static void main(String[] args) {
		Child c=new Child();
		c.disp();
		
		
	}

	public String x;
}
abstract class Parent{
	int x=10;
    abstract void disp();
}
class Child extends AppParent{
    int x=20;
    void disp() {
	System.out.println("this is child methode");
	System.out.println("Parent x = " + super.x);
	System.out.println("Child x = " + this.x);
  }

          // we can't override final methods
}