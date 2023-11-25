package object.classes;

public class Mobile {
	
	//multiple attributes
	String brand = "SAMSUNG";
	String model = "Galaxy S23 Ultra";
	int price = 1499;
	int releaseDate = 2023;
	
	//behavior
	public void Ring() {
		
		System.out.println("Mobile is ringing ");
		
	}
	
	// no arguments
	public Mobile () {
		
	}
	
	//parameterized constructor
	public Mobile(String brand, String model, int price, int releaseDate) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.releaseDate = releaseDate;
		
	}

	
	public static void main(String[] args) {
		
	Mobile mb1= new Mobile();
	
	System.out.println(mb1.brand);
	System.out.println(mb1.model);
	System.out.println("costs $" + mb1.price);
	System.out.println("and will be released in "+ mb1.releaseDate);
	

	mb1.Ring();
	
	}

}
