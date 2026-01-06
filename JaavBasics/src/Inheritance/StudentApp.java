package Inheritance;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();
		Bike b = new Bike("hp",55000, "white");
		s.hasA(b);
		

	}

}
class Student{
	Heart h = new Heart("teacher", 10.0);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		
	}
	
}
class Bike{
	String brand;
	int price;
	String color;
	
	public Bike(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	} 
	//setter method
	public String setBrand(){
		return this.brand= brand;
	}
	
	
	public int getPrice() {
		return price;
	} 
	
	public int  setPrice( ) {
		return this.price = price;
	}
	public String getColor() {
		return color;
	} 
	//setter method
	public String setColor()
	{
		return this.color= color;
	}
	
}
class Heart{
	String job;
	double height;
	public Heart(String job, double height) {
		super();
		this.job = job;
		this.height = height;
	}
	public String getJob() {
		return job;
	}
	public String setJob(String job) {
		return this.job = job;
	}
	public double getHeight() {
		return height;
	}
	public double setHeight(double height) {
		return this.height = height;
	}
}






