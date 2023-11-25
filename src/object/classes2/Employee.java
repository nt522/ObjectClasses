package object.classes2;

//A class can have multiple constructors,this is known as constructor overloading
//to String()

//this keyword is used to differentiate between instance variable and local variable,readability is increase

public class Employee {
	
	String name = "monika"; // here name is instance variable
	int age = 20;
	int mb = 1234; // default value of mb will be zero if value is not assigned manually
	
	
	public Employee() { // no - arg constructor(default)
		
		
	}
	
	//parameterized constructor
	
	public Employee(String name, int age) { //2 parameters, here name is local variable
		this.name = name; //this.name represents instance variable
		this.age = age;
		
	}
	
	public Employee(int x, String y, int z) { // 2 parameters/arguments
		
		
		age = x;
		name = y;
		mb = z;
	}
	
	public Employee(String name, int age, int mb) { //3 parameters/arguments
		
		this.name = name;
		this.age = age;
		this.mb = mb;
	}
	
	public void walk() { //this method has no parameters/argument
		
		System.out.println("Employee is walking");
		
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", mb=" + mb + "]";
	}
	
	

}
