
public class Driver {
	public static void main(String [] args) {
		// Dog is the class
		// Classes are always upper case
		// dog1 is the object or instance
		Dog dog1 = new Dog("Archie","mutt","white",1);
		
		//set attributes
		dog1.name = "cheese";
	
		//call methods
		dog1.bark();
		dog1.eat();
		
		dog1.setAge(-5);
		System.out.printf("age: %d\n", dog1.getAge());
		
		//prints the number of dogs using object.varible
		System.out.printf("NoDogs: %d\n", dog1.noDog );
		//uses the method inside dog and prints number of dogs
		Dog.printNoDog();
		
	}
}
