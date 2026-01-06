package Inheritance;

public class ParentApp2 {
		public static void main(String[] args) {
			childA c=new childA();
			c.disp();
		}

	}
	class childA extends ParentA{
		protected void disp() {
			System.out.println("this is child method");
		}
	}


