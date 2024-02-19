
public class Driver {
	public static void main(String [] args) {
		// Dog is the class
		// Classes are always upper case
		// dog1 is the object or instance
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog("Spike","mutt","black",5);
		
		
		
		// reference attributes//
		dog1.name = "archie";
		dog1.breed = "bulldog";
		dog1.color = "brown";
		dog1.age = 1;
		
		// or call methods
		dog1.bark();
		dog1.eat();
		
		// reference attributes
		dog2.name = "shitass";
		dog2.breed = "beagle";
		dog2.color = "white";
		dog2.age = 50;
				
		// or call methods
		dog2.bark();
		dog2.eat();
		
		// or call methods
		dog3.bark();
		dog3.eat();
		
		System.out.printf("NoDogs: %d\n", dog1.noDog );
		
		Dog.printNoDog();
		
	}
}
