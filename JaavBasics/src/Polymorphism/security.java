package Polymorphism;

public class security {
	private static final String Security = null;
	public static void main(String[] args) {
         // Parent reference

        Object security = new Army();    // Army object
        ((Polymorphism.security) security).job();
        ((Polymorphism.security) security).protect();

        security = new Navy();    // Navy object
        ((Polymorphism.security) security).job();
        ((Polymorphism.security) security).protect();
    }


	static void job() {
		System.out.println("To protect nation");
	}
	void protect() {
		System.out.println("protect country");
	}

}
class Army extends security{
	void protect() {
		System.out.println("protect nation");
	}
}
class Navy extends security{
	void protect() {
		System.out.println("protect ocean");
	}
}