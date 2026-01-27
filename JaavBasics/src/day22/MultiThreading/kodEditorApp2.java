package day22.MultiThreading;

public class kodEditorApp2 {
	public static void main(String[] args) {
		kodEditor t1=new kodEditor();
		kodEditor t2=new kodEditor();
		kodEditor t3=new kodEditor();
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		t1.start();
		t2.start();
		t3.start();
	}

}
class kodEditor extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")){
			typing();
		}
		else if (tName.equals("Spell")) {
			spellCheck();
		}
		else {
			saving();
		}
				
	}
	private void saving() {
		// TODO Auto-generated method stub
		
	}
	void typing() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Typing");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void spellCheck() {
		
		for(int i=0; i<10; i++) {
			System.out.println("SpellCheck");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	void saving() {
		for(int i=0; i<10; i++) {
			System.out.println("Saving");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
	
}
