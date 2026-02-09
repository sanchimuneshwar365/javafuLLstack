package Map;

public class StudentCT {

	@Override
	public String toString() {
		return "StudentCT []";
	}
	
	

}
public class studentDetail{
	String name;
	int age;
	String Department;
	int Adhar_No;
	int Height;
	int weight;
	String gender;
	
	public studentDetail(int age, String name, String Department, int Adhar_No, int Height, int weight, String gender) {
		this.name=name;
		this.age=age;
		this.Adhar_No=Adhar_No;
		this.Height=Height;
		this.weight=weight;
		this.Department=Department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment() {
		this.Department=Department;
	}
	public String getGender(String gender) {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		this.Height=height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getAdhar_No() {
		return Adhar_No;
	}
	public void setAdhar_No(int Adhar_No) {
		this.Adhar_No=Adhar_No;
	}
}

