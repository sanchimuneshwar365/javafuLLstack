package priyadarshini.com;
import java.util.ArrayList;
import java.util.List);
class Students{
	int id;
	String name;
	double marks;
	
	Students(int id, Stirng name, double marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+" "+marks);
	}
}
class main{
	
}

public class StudentManagement {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Rahul", 85.5));
		students.add(new Student(102, "Ayesha", 92.0));
		students.add(new Students(103, "Amit", 78.4));
		
		for (Students : students) {
			s.display();
		}
	}

}
