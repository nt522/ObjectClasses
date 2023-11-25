package object.classes2;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee emp3=new Employee("Bishal",25);
		
		Employee emp4=new Employee("Surendra",24);
		
		Employee emp5=new Employee("manish",28,5678);//calling constructor having 3 parameters
		
		System.out.println(emp5.name+"  "+emp5.age+" "+emp5.mb);//manish  28 5678
		
		//print the whole object instantly using toString()
		
		System.out.println(emp5);//Employee@15db9742,,to overcome this override toString()
		
		System.out.println(emp4);//Employee [name=Surendra, age=24, mb=1234] if toString() is overridden
		
		
		
		//calling constructor which is not using this keyword
		
		Employee emp6=new Employee(25,"Vishal", 3468);//public Employee(int x, String y, int z) will be called
		System.out.println(emp6);
		
		
		
		Employee emp7 = new Employee();
		System.out.println(emp7.name);
		
	}

}
