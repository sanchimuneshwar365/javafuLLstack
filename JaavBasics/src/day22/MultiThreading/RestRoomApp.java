package day22.MultiThreading;

public class RestRoomApp {

	public static void main(String[] args) throws InterruptedException {
		WashRoom w=new WashRoom();
		Thread t1 =new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		t1.setName("Thor");
		t1.setName("Loki");	
		t1.setName("Hulk");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		
	}
	
}
class WashRoom implements Runnable{

	
	public void run() {
		try {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" is enter the washroom");
			
			Thread.sleep(3000);
			System.out.println(tName+" is using the washroom");
		
			Thread.sleep(3000);
			System.out.println(tName+" is existing the washroom");
		
		
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
} 
}
