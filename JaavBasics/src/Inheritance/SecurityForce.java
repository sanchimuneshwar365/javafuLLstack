package Inheritance;

public class SecurityForce {
	
	 void job() {
		 System.out.println("To protect Nation");
	 }
	 void protect() {
		System.out.println("Protect Country");
		
	}

}
class Army extends SecurityForce{
	 void protect() {
		System.out.println("Protect land");
	}
	void useTank() {
		System.out.println("Army uses tanks");
	}
}
class Navy extends SecurityForce{
	 void protect() {
		System.out.println("Protect ocean");
	}
		void useShips() {
			System.out.println("Navy uses distroyers");
		}
}
class AirForce extends SecurityForce{
	 void protect() {
		System.out.println("Protect Air ways");
	}
		void useJets() {
			System.out.println("Air Force uses Rafale");
		}
}
