package object.classes;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee emp1=new Employee();//calling no-argument constructor
		Employee emp2=new Employee();
		
		System.out.println(emp1.name+"  "+emp1.age);
		System.out.println(emp2.name+"  "+emp2.age);
		
		
		
		//using parameterized constructor
		Employee emp3=new Employee("Bishal",25);
		Employee emp4=new Employee("Surendra",24);
		
		
		System.out.println(emp3.name+"  "+emp3.age);
		System.out.println(emp4.name+"  "+emp4.age);
		
		emp1.walk();
	}

}
