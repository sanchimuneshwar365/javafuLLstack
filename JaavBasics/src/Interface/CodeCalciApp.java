package Interface;

import java.util.Scanner;

public class CodeCalciApp {
	public static void main(String[] args) {
		duty(new RupeshSoft());
		duty(new AyushInfotech());		
	}
	static void duty(CodeCalcii c) {
		c.add();
		c.sub();
		c.mul();
		c.div();
		
	}

}
class RupeshSoft implements CodeCalcii{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("add : " + c);
	}
	public void sub() {
		int a=40;
		int b=20;
		int c=a-b;
		System.out.println("sub : " + c);
	}
	public void mul() {
		int a=25;
		int b=10;
		int c=a*b;
		System.out.println("mul : " + c);	
	}
	public void div() {
		int a=25;
		int b=250;
		int c=a/b;
		System.out.println("div : " + c);
	}
}
class AyushInfotech implements CodeCalcii{
	Scanner sc=new Scanner(System.in);
		public void add() {
			System.out.println("ENTER THE NUMBER 1 TO ADD : ");
		    int a= sc.nextInt();
			System.out.println("ENTER THE NUMBER 2 TO ADD : ");
			int b= sc.nextInt();
			System.out.println("ADD : " + (a+b));
		}
		public void sub() {
			System.out.println("ENTER THE NUMBER 1 TO SUB");
			int a= sc.nextInt();
			System.out.println("ENTER THE NUMBER 2 TO SUB");
			int b= sc.nextInt();
			System.out.println("SUB : " + (a-b));

		}
		public void mul() {
			System.out.println("ENTER THE NUMBER 1 TO MUL");
			int a= sc.nextInt();
			System.out.println("ENTER THE NUMBER 2 TO MUL");
			int b= sc.nextInt();
			System.out.println("MUL : " + (a*b));		
		}
		public void div() {
			System.out.println("ENTER THE NUMBER 1 TO DIV");
			int a= sc.nextInt();
			System.out.println("ENTER THE NUMBER 2 TO DIV");
			int b= sc.nextInt();
			System.out.println("DIV : " + (a/b));	
			
		}
	}
