package Abstraction;

public class Birds {
	public static void main(String[] args) {
		duty(new VegSparrow());
		duty(new NonVegSparrow());
		
	}
	private static void duty(VegSparrow b) {
		// TODO Auto-generated method stub
		
	}
	static void duty(Bird b ) {
		b.eat();
		b.fly();
	}

}
abstract class Bird{
	abstract void eat();
	abstract void fly();
	
}
abstract class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow is flying");
	}
}
class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("Veg Sparrow eat grains");
	}
}
class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("nonveg sparrow eat worms");
	}
}