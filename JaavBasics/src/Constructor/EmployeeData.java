package Constructor;

public class EmployeeData {
	private int Employee_Id;
	private String Name;
	private int Salary;
	
	public void Employee(int id, String name, int Salary) {
		Employee_Id = id;
		Name = name;
		Salary = Salary;
		
		
	}
	String getName() {
		return Name;
		
	}
	int getID() {
		return Employee_Id;
	}
	int getSalary() {
		return Salary;
	}
	

}
