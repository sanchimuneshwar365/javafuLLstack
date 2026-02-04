package Collection;
import java.util.LinkedList;
import java.util.ArrayList;


public class Demo3 {
	public static void main(String[] args) {
			ArrayList al = new ArrayList<>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add("Sanchi");
			al.add(true);
			
			System.out.println(al);
			
			LinkedList ll = new LinkedList<>();
			ll.add(45);
			ll.add("Sanchi");
			ll.add(70);
			ll.add(3.6);
			System.out.println(ll);
			
			ArrayList arr = new ArrayList<>();
			arr.addAll(al);
			System.out.println(arr);
			arr.add(1,90);
			System.out.println(arr);
			System.out.println(arr.contains(30));
			arr.remove(1);
			System.out.println(arr);
			
			
		}
	}

