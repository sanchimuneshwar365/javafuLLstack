package Inheritance;

public class Player {
	String name;
	int age;
	String gender;
	
	// Constructor 
}
class FootBall extends Player{
	int goals;
	int assist;
	public FootBall(String name,int age,String gender,int goals, int assist) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.goals = goals;
		this.assist = assist;	
	}
	public int getGoals() {
		return goals;
	}
	public int getAssist() {
		return assist;
	}
	public String getName() {
		return name;
	}
}
