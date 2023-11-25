package object.classes;

public class DogMain2 {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		
		
		System.out.println(dog1.name +"  "+dog1.color+" "+dog1.age);	//jacky  red 10
		
		System.out.println(dog2.name +"  "+dog2.color+" "+dog2.age);
		
		
		//i want to change the name of dog1
		
		dog1.name="Mankky";
		//print details of dog1
		
		System.out.println(dog1.name +"  "+dog1.color+" "+dog1.age);	//Mankky  red 10
		
	}

}
