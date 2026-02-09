package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employe_main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			Employee2 e = new Employee2("Sachii",101,800000);
			Employee2 e1 = new Employee2("Arsh",102,90000);
			Employee2 e2 = new Employee2("Akshu",103,70000);
			Employee2 e3 = new Employee2("Khushii",104,50000);
			Employee2 e4 = new Employee2("Astha",105,40000);
			
			
			ArrayList al = new ArrayList();
			al.add(e);
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
SortingComplexobject ob=new SortingComplexobject();
Collections.sort(al);
System.out.println(al);

	}

}
class sortComplexObject implements Comparator{
	
	
		
	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(((Employee2)(o1)).salary>((Employee2)(o2)).salary){
			return 1;
			
			
		}
		else {
			return -1;
		}
	
	}
}

