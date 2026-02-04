package com.Encapsulation;
import java.util.Scanner; 

public class Student {
	private String name;
	private int age;
	private String gender;
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
	
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setGender(String gender) {
	this.gender=gender;
	
}
public String getGender() {
	return gender;
    }

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
	System.out.println("enter your name");
	int age1= sc.nextInt();
	System.out.println("enter your age");
	int age=sc.nextInt();
	System.out.println("enter your gender");
	String gender=sc.next();
	
	System.out.println("----------Student Details----------");
	System.out.println("Name  : " + s.getName()); 
	System.out.println("Age   : " + s.getAge()); 
	System.out.println("Gender: " + s.getName());
	
    sc.close();
	}		
	}		
			
			
