package Polymorphism;

public class Tendulkar {
	public static void main(String[] args) {
		Tendulkar1 t=new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();
//		t.smoke(); child class object specialized method does not accept that why it override

	}

}
class Tendulkar1{
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("He is batsman");
	}
}
class ArjunTendulkar extends Tendulkar1{
	void profession() {
		System.out.println("He is baller");
	}
	void smoke() {
		System.out.println("He smoke some time");
		
	}
}