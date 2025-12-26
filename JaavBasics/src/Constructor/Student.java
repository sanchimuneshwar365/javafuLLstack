package Constructor;

public class Student {
	private String name;
	private int age;
	private String gender;
	
	//Constructor
	public Student(String name, int age, String gender) {
		this.name = name;
		this.age=age;
		this.gender=gender;
	}
	// Getter 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	// Setter Method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		
	}

}
