package object.classes2;

public class Dog1 {

	String name = "Snow";
	String type = "Shiba";
	String mode = "adopted";
	int age;
	int weight;
	int height;
	
	
	public Dog1() {
		
	}
	
	
	public void cry () {
		System.out.println("Snow is crying");
		
	}
	public void run() {
		System.out.println("Snow is running");
	}
	
	
	
	
	public Dog1 (String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Dog1 [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
	
	public Dog1 (String x, String y, int pounds, int feet ) {
		
		name = x;
		mode = y;
		weight = pounds;
		height = feet;
		
	}
	
}
