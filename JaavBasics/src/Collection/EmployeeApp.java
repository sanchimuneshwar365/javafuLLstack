package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {
		public static void main(String[] args) {
			Employee e = new Employee("Sachii",101,800000);
			Employee e1 = new Employee("Arsh",102,90000);
			Employee e2 = new Employee("Akshu",103,70000);
			
			ArrayList al = new ArrayList();
			al.add(e);
			al.add(e1);
			al.add(e2);
			
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			
		}

	}

	class Employee<String>{
		
	String Employee_Id;
	int age;
	String gender;
	int Salary;

	public Employee(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public Employee(String Employee_Id, String gender, int age, int Salary) {
		
	}

	public String Employee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(String Employee_Id) {
	    this.Employee_Id = Employee_Id;
	}

	public String getGender() {
	    return gender;	
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int age() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int salary() {
		return Salary;
	}
	public void setSalary(int salary) {
		this.Salary = salary;
	}
	}


