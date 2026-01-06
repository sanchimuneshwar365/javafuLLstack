package Abstraction;

public class SecurityForce {
	public static void main(String[] args) {
		System.out.println("=======Army=====");
		duty1(new Army());
		System.out.println();
		System.out.println("=======Navy=====");
		duty1(new Navy());
		System.out.println();
		System.out.println("=======Airways=====");
		duty1(new AirForce());

} 
	static void duty1 (SecurityForce1 sf) {
		sf.protect();
	}
}

	
abstract class SecurityForce1{
	abstract void protect();
}
class Army extends SecurityForce{
	void useTank() {
		System.out.println("Army use Tank");
	}
	void protect() {
		System.out.println("protect Land");
	}
}
class Navy extends SecurityForce{
	void useShips() {
		System.out.println("Navy use distroyers");
	}
	void protect() {
		System.out.println("protect sea");
	}
}
class AirForce extends SecurityForce{
	void useJets() {
		System.out.println("AirForce use Jets");	
		}
	void protect() {
		System.out.println("protect Airways");
	}
}