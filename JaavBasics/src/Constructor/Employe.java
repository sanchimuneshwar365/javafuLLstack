package Constructor;

public class Employe {
	private int emp_id;
	private String name;
	private int salary;
	
	public Employe() {
		this(101,"Sanchi",15000);
		System.out.println("0 parameterized constructor is called");
	}

	public Employe(int emp_id,String name) {
		this(101);
		System.out.println("2 parameterized constructor is called");
		
	}
	public Employe(int emp_id,String name,int salary) {
		this(101,"Sanchi");
		System.out.println("3 parameterized constructor is called");
	}

	public Employe(int i) {
		// TODO Auto-generated constructor stub
	}
	
	

}
