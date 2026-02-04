package day22.MultiThreading;


public class KodEditorApp {

	public static void main(String[] args) {
		Typing t1 = new Typing();
		Spellcheck t2 = new Spellcheck();
		Saving t3 = new Saving();
			t1.start();
			t2.start();
			t3.start();
		}

	}
class Typing extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Typing ......");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
class Spellcheck extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Spell Check ......");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
class Saving extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Saving ......");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

	
