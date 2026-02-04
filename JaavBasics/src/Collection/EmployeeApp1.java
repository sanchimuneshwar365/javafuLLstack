package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp1 {

	public static void main(String[] args) {
		
			Employee2 e = new Employee2("Sachii",101,800000);
			Employee2 e1 = new Employee2("Arsh",102,90000);
			Employee2 e2 = new Employee2("Akshu",103,70000);
			
			ArrayList al = new ArrayList();
			al.add(e);
			al.add(e1);
			al.add(e2);
			
			
			Collections.sort(al);
			System.out.println(al);
			
		}

	}
class Employee2 implements Comparable{
	int id;
	String name;
	int salary;
	public Employee2(String name, int id, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public int getsalary() {
		return salary;
		
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}


	@Override
	public int compareTo(Object o) {
		int res=(this.name).compareTo((((Employee2)(o)).name));
		if(res>0) {
			return 1;
		}
		
		else {
			return -1;
		}
			
		
	}
}

