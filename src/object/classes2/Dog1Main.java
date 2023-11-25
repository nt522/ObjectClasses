package object.classes2;

public class Dog1Main {

	public static void main(String[] args) {
		
		
		/*Dog1 dog1A = new Dog1();
		System.out.println(dog1A.name);*/
		
		
		Dog1 dog1B = new Dog1("Takker", "American Eskimo", 9);
		System.out.println(dog1B.name + " " + dog1B.type + " " + dog1B.age +" years old");
		
		
		
		Dog1 Dog1C = new Dog1("Kukur", "Tibetan Mastif", 16);
		System.out.println(Dog1C);
		Dog1 Dog1D = new Dog1("Chanel", "Australian Shepherd", 12);
		System.out.println(Dog1D);
		
		
		
		Dog1 Dog1E = new Dog1("Kukur", "Exotic", 15, 3);
		System.out.println(Dog1E.name+ " " + Dog1E.mode +" "+ Dog1E.weight + " pounds " + Dog1E.height + " feet");
		

		

	}

}
