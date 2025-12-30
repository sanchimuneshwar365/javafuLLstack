package InstanceVariable;

public class AreaOfTriangle {
	
	// double variables
	int base;
	int height;
	static float pi = 3.14f;
	
	// Constructor to i itialize instance variables
	public AreaOfTriangle(int base, int height){
		this.base = base;
		this.height = height;
		
	}
	
	// Non static method to calculate area 
	double disp() {
		double result = 0.5 * base * height;
		return result;
	}
	
	
	public static void main(String [] args) {
		AreaOfTriangle t = new AreaOfTriangle(4,3);
		System.out.println(t.disp());
	}
	

}
