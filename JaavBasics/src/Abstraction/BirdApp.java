package Abstraction;

public class BirdApp {
	public static void main(String[] args) {
		//Sparrow s=new Sparrow();    cannot instinitiate Sparrow abstract class         
	}

}
abstract class Sparrow{
	abstract void eat();  // 2 
	void fly() {
		System.out.println("Sparrow is flying");
	}
}

 //abstract class Sparrow{ 
//	void fly() {
	//	System.out.println("Sparrow is flying");
//	}
//}
abstract class Bird{
	abstract void eat();
	abstract void fly();
}

abstract class Sparrow1 extends Bird{            // The type Parrot must implement the implement the inherited abstract method Bird.fly()
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
