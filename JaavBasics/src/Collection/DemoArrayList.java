package Collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList {
	public static void main(String[] args) {
	  ArrayList <Integer>al=new ArrayList();
				  al.add(100);
				  al.add(50);
				  al.add(25);
				  al.add(75);
				  al.add(125);
				  al.add(175);
				  
		ListIterator<Integer>itr = al.listIterator(al.size());
		while (itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}

	
	}

		
	}


