package Abstraction;

public class Shapes {
	public static void main(String[] args) {
		
		
		
	}

}
abstract class Shape{
	abstract void findArea();
	void dispArea() {
		System.out.println("Display the Area");
	}
}
class Circle extends Shapes{
	void findArea() {
		double r=10;
		double area=3.14*r*r;
		System.out.println("area of circle ="+area);
	}
		
}
class Triangle extends Shapes{
	void findArea() {
		double b=4,h=8;
		double area =0.5*b*h;
		System.out.println("area of triangle");
		
	}
}
class Square extends Shapes{
	void findArea() {
		int side = 8;
		int area =side*side;
	}
}


