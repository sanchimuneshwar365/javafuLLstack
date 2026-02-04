package Collection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class CombineLoop {
	public static void main(String[] args) {
		//array list
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Sanchi");
		al.add('A');
		al.add(30.5);
		al.add(true);
		System.out.println(al);
		
		//for each
		int arr[]= {10,20 ,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// Inhance for
		for(Object x:al) {
        	System.out.println(x+"");
        }
		
		//iterator
        Iterator itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//list iterator
        ListIterator litr =al.listIterator(al.size());
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous()+" ");
		}
		
		//not support for decending iterator
//		Iterator litr =al.descendingIterator();		
//		while(litr.hasNext()) {
//			System.out.println(litr.next()+" ");
//	}

        //not support for enumeration
//		Enumeration el = v.elements();	
//		while (el.hasMoreElements()){
//			System.out.println(el.nextElement()+"  ");
//		}
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("Sanchi");
		ll.add('A');
		ll.add(30.5);
		ll.add(true);
		
		System.out.println(ll);
		//for each
				int arrr[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr.length;i++) {
					System.out.println(arrr[i]);
				}
				
				// Inhance for
				for(Object x:ll) {
		        	System.out.println(x+"");
		        }
				//iterator
		        Iterator itr1 =ll.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}

				//list iterator
		        ListIterator litr1 =ll.listIterator(ll.size());
				
				while(litr1.hasPrevious()) {
					System.out.println(litr1.previous()+" ");
				}
				

				Iterator litr2 =ll.descendingIterator();		
				while(litr.hasNext()) {
					System.out.println(litr.next()+" ");
			}

				
//		        not support for enumeration
//				Enumeration el =ll.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
				
				ArrayDeque ad =new ArrayDeque();
				long t1=System.currentTimeMillis();
				for(int i=0;i<80000;i++) {
					ad.push(i);
				}
				
				long t2=System.currentTimeMillis();
		        LinkedList ll1 =new LinkedList();
		        long t3=System.currentTimeMillis();
		        for(int i=0;i<80000;i++) {
					ll.push(i);
				}
		        long t4=System.currentTimeMillis();
		        System.out.println(t2-t1);
		        System.out.println(t4-t3);
		      //for each
				int arrr1[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr1.length;i++) {
					System.out.println(arrr1[i]);
				}
				
				//iterator
		        Iterator itr2 =ad.iterator();
				while(itr2.hasNext()) {
					System.out.println(itr2.next());
				}

				//list iterator
//		        ListIterator litr2=ad.listIterator(ad.size());
//				
//				while(litr2.hasPrevious()) {
//					System.out.println(litr2.previous()+" ");
//				}
				
				Iterator litr3 =ad.descendingIterator();		
				while(litr3.hasNext()) {
					System.out.println(litr3.next()+" ");
			}

				
//		        not support for enumeration
//				Enumeration el = ad.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
//				
				
				PriorityQueue pq =new PriorityQueue();
				pq.add(100);
				pq.add(50);
				pq.add(150);
				pq.add(25);
				pq.add(75);
				pq.add(125);
				pq.add(175);
				
				System.out.println(pq);
				//for each
				int arrr2[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr2.length;i++) {
					System.out.println(arrr2[i]);
				}
				
				// Inhance for
				for(Object x:pq) {
		        	System.out.println(x+"");
		        }
				//iterator
		        Iterator itr3 =pq.iterator();
				while(itr3.hasNext()) {
					System.out.println(itr3.next());
				}

				// not support list iterator
//		        ListIterator litr3=pq.listIterator(ad.size());
//			    while(litr3.hasPrevious()) {
//				System.out.println(litr3.previous()+" ");
//			}
				// not support
//				Iterator litr4 =pq.descendingIterator();		
//				while(litr4.hasNext()) {
//					System.out.println(litr4.next()+" ");
//			}

				
//		        not support for enumeration
//				Enumeration el =pq.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
//				
				TreeSet ts =new TreeSet();
				ts.add(100);
				ts.add(50);
				ts.add(150);
				ts.add(25);
				ts.add(75);
				ts.add(125);
				ts.add(175);
		       System.out.println(ts);
				
		     //for each
				int arrr3[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr3.length;i++) {
					System.out.println(arrr3[i]);
				}
				
				//// Inhance for
				for(Object x:ts) {
		        	System.out.println(x+"");
		        }
				//iterator
		        Iterator itr4 =ts.iterator();
				while(itr4.hasNext()) {
					System.out.println(itr4.next());
				}

				// not support list iterator
//		        ListIterator litr4=ts.listIterator(ts.size());
//			    while(litr4.hasPrevious()) {
//				System.out.println(litr4.previous()+" ");
//			}
				// descendingIterator
				Iterator litr5 =ts.descendingIterator();		
				while(litr5.hasNext()) {
					System.out.println(litr5.next()+" ");
			}
	
//		        not support for enumeration
//				Enumeration el =ts.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
				
				HashSet hs =new HashSet();
				hs.add(100);
				hs.add(50);
				hs.add(150);
				hs.add(25);
				hs.add(75);
				hs.add(125);
				hs.add(175);
				System.out.println(hs);
				
				//for each
				int arrr4[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr4.length;i++) {
					System.out.println(arrr4[i]);
				}
				
				// Inhance for
				for(Object x:hs) {
		        	System.out.println(x+"");
		        }
				//iterator
		        Iterator itr5 =hs.iterator();
				while(itr5.hasNext()) {
					System.out.println(itr5.next());
				}

				//not support for list iterator
//		        ListIterator litr5 =hs.listIterator(al.size());
//				
//				while(litr5.hasPrevious()) {
//					System.out.println(litr5.previous()+" ");
//				}
				
				//not support for decending iterator
//				Iterator litr6 =hs.descendingIterator();		
//				while(litr6.hasNext()) {
//					System.out.println(litr6.next()+" ");
//			}

				
		        //not support for enumeration
//				Enumeration el = v.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
				
				LinkedHashSet lhs =new LinkedHashSet();
				lhs.add(100);
				lhs.add(50);
				lhs.add(150);
				lhs.add(25);
				lhs.add(75);
				lhs.add(125);
				lhs.add(175);
				System.out.println(lhs);
				
				//for each
				int arrr5[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr5.length;i++) {
					System.out.println(arrr5[i]);
				}
				
				// Inhance for
				for(Object x:lhs) {
		        	System.out.println(x+"");
		        }
				
				//iterator
		        Iterator itr6 =lhs.iterator();
				while(itr6.hasNext()) {
					System.out.println(itr6.next());
				}

				//not support for list iterator
//		        ListIterator litr6 =lhs.listIterator(al.size());
//				
//				while(litr6.hasPrevious()) {
//					System.out.println(litr6.previous()+" ");
//				}
				
				//not support for decending iterator
//				Iterator litr7 =lhs.descendingIterator();		
//				while(litr7.hasNext()) {
//					System.out.println(litr7.next()+" ");
//			}

				
		        //not support for enumeration
//				Enumeration el = v.elements();	
//				while (el.hasMoreElements()){
//					System.out.println(el.nextElement()+"  ");
//				}
				
				Vector v =new Vector();
				v.add(10);
				v.add(20);
				v.add(30);
				v.add(40);
				v.add(50);
				v.add(60);
				System.out.println(v);
				
				//for each
				int arrr6[]= {10,20 ,30,40,50};
				for(int i=0;i<arrr6.length;i++) {
					System.out.println(arrr6[i]);
				}
				// Inhance for
				for(Object x:v) {
		        	System.out.println(x+"");
		        }
				//iterator
		        Iterator itr7 =v.iterator();
				while(itr7.hasNext()) {
					System.out.println(itr7.next());
				}

				
		        ListIterator litr7 =v.listIterator(al.size());
				
				while(litr7.hasPrevious()) {
					System.out.println(litr7.previous()+" ");
				}
				
				//not support for decending iterator
//				Iterator litr8 =v.descendingIterator();		
//				while(litr8.hasNext()) {
//					System.out.println(litr8.next()+" ");
//			}

				
		        // support for enumeration
				Enumeration el = v.elements();	
				while (el.hasMoreElements()){
					System.out.println(el.nextElement()+"  ");
				}
				
				
			}

	}