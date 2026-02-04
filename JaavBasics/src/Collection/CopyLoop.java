package Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		
							 al.add(100);
							 al.add(50);
							 al.add(150);
							 al.add(75);
							 al.add(125);
							 al.add(175);
							    
							    Iterator itr = al.iterator();
							    while(itr.hasNext()) {
							    	System.out.println(itr.next()+" ");
							    	al.add(50);
							    }
							    
							    Iterator itr1 = al.iterator();
							    while(itr1.hasNext()) {
							    	System.out.println(itr.next()+" ");
							   
							    }
					   

	}

}
