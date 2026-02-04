package Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeVsLinkedList {
	public static void main(String[] args) {
		
		ArrayDeque ad=new ArrayDeque();
		long t1=System.currentTimeMillis();
		for(int i=0;i<80000000;i++) {
			ad.push(i);
		}
		long t2=System.currentTimeMillis();
		LinkedList ll=new LinkedList();
		long t3=System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			ll.push(i);
		}
		long t4=System.currentTimeMillis();
		
	}

}
