package com.Encapsulation;
import java.util.Scanner; 

public class Student {
	private String name;
	private int age;
	private String gender;
public void setName(String name) {
	name=name;
}
public void getName() {
	name=name;
	
}
public void setAge(int age) {
	age=age;
}
public int getAge() {
	return age;
}
public void setGender(String gender) {
	gender=gender;
	
}
public String getGender() {
	return gender;
    }

void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String s=sc.next();
	System.out.println("enter your age");
	int age=sc.nextInt();
	System.out.println("enter your gender");
	String gender
}
