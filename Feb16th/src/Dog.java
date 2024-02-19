
public class Dog {
	//instance variables
	public String name;
	public String color;
	public String breed;
	public int age;
	//number of dogs
	public static int noDog=0;
	
	//empty constructor
	public Dog() {
		Dog.noDog++;
		
	}
	
	//create a constructor
	public Dog(String name, String breed, String color, int age) {
		this.noDog++;
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	
	//instance method
	public void bark() {
		System.out.printf("%s says meow meow\n",this.name);
	}
	
	//instance method
	public void eat() {
		System.out.printf("%s says chomp chomp\n",this.name);
	}

	public static void printNoDog() {
		System.out.printf("NoDogs: %d\n", Dog.noDog );
		
	}
}