package object.classes;

public class Employee {
	
	
	String name = "monika";
	int age = 20;
	
	public Employee() { // no arg constructor(default)
		
		
	}
	
	// parameterized constructor
	
	public Employee(String name, int age ) {
		// 2 parameters/arguments
		
		this.name = name;
		this.age = age;
		
	}
	
	public void walk() { //this method is having no parameter/arguments 
		
		System.out.println("employee is walking");
	}
		
	

}
