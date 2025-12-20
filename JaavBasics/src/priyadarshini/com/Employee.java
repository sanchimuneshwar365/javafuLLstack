package priyadarshini.com;

abstract class Employee {
	int id;
	String name;
	abstract int calculateSalary();
	
}
class FullTimeEmployee extends Employee
{
	public static String calculate;

	int calculateSalary()
	{
		return(25000);
	}
}
class PartTimeEmployee extends Employee
{
	int calculateSalary()
	{
		return(20000);
	}
}
public class Test {
	public static void main(String[] args) {
		
FullTimeEmployee[] e=new FullTimeEmployee[2];
e[0]=new FullTimeEmployee();
e[0].id=1;
e[0].name="A";
e[1]=new FullTimeEmployee();
e[1].id=11;
e[1].name="AA";
for(int i=0;i<2;i++)
{
	System.out.println("id:"+e[i].id+"Name:"+e[i].name+"Salary:"+e[i].calculate);
}
	}
}





















