package Collection;

import java.util.ArrayList;

public class RetainAllAndSet {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(100);
		arr.add(150);
		arr.add(50);
		arr.add(25);
		arr.add(75);
		arr.add(125);
		arr.add(175);
		arr.add(10);
		arr.set(1,99);
		System.out.println("List 1>"+arr);
		ArrayList arr1=new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		System.out.println("List 2>"+arr);
		arr.retainAll(arr);
		System.out.println("List 1>"+arr);
	}

}
