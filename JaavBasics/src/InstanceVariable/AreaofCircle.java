package InstanceVariable;

public class AreaofCircle {
	
	// Instance variable
	double radius;
	
	// Constructor to initialize variable
	void Circle(double r){
		radius = r;
	}
	
	// Method to calculate area
	void findArea(float radius) {
		double area = 3.14 * radius * radius;
		System.out.println(area);
	}
	// Main Method 
	public static void main(String[] args) {
		AreaofCircle c = new Circle(5);     // radius = 5 
		c.findArea(7);
		
	}
	
	

}
