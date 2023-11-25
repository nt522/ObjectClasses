package object.classes;

public class Cat {

		String name = "jacky";//default value of name will be null
		String color ="red";
		int age=10;//default value of name will be 0
	
		void bark(){
			System.out.println("i have started barking");
		
		}
	
		void jump(){
			System.out.println("i have started jumping");
	
		}
	
	
		public static void main(String[] args) {
		
				Cat cat1=new Cat();
				Cat cat2=new Cat();
		
				System.out.println(cat1.name);
				System.out.println(cat1.color);
				System.out.println(cat1.age);
		
		
				System.out.println(cat2.name +"  "+cat2.color+" "+cat2.age);

		

	}

}
