package Collection;

public class StudentApp { 
	public static void main(String[] args) {
		Student st1=new Student("Sanchi","Female",20);
		Student st2=new Student("Akansha","Female",22);
		Student st3=new Student("Sanjana","Female",23);
		Student[] arr= {st1, st2, st3};
		
		for(Student s:arr) {
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getGender());
			System.out.println("--------------------------");
		}
	}
	
}
class Student{
	String name;
	int age;
	String gender;
		  
		  public Student(String name, String gender, int age) {
			  this.name = name;
			  this.gender = gender;
			  this.age = age;
		  }
		  
		  public char[] getGender() {
			// TODO Auto-generated method stub
			return null;
		}

		  public String getName() {
			  return name;
		  }
		  public String getgender() {
			  return gender;
		  }
		  public int getAge() {
			  return age;
		  }

		}


        



