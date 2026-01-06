package Inheritance;

public class Parent {
	Animal disp() {
	Animal a=new Animal();
		return a;
	}
	

}
class child extends Parent{
	Dog disp() {
		Dog d=new Dog();
		return d;
	}
}
class Animal{
	
}
class Dog extends Animal{
	
}
