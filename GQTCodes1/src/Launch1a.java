/**
 * 
 */

/**
 * @author GQT-Trainer1
 *
 */
class Dog{
	String name;
	String color;
	int cost;
	String breed;
	
	void run() {
		System.out.println("Dog can run");
	}
	void walk() {
		System.out.println("Dog can walk");
	}
	void sleep() {
		System.out.println("Dog can sleep");
	}
}

public class Launch1a{
	public static void main(String args[]){
		Dog d = new Dog();
		d.name = "Tommy";
		d.color = "White";
		d.cost = 5000;
		d.breed = "GR";
		System.out.println("The Properties of dog are:");
		System.out.println(d.name);
		System.out.println(d.color);
		System.out.println(d.cost);
		System.out.println(d.breed);
		
		System.out.println("The Behaviour of the dog is:");
		d.run();
		d.walk();
		d.sleep();
		
		System.out.println("------------------------------");
		
		Dog d1 = new Dog();
		d1.name = "Jerry";
		d1.color = "Brown";
		d1.cost = 6000;
		d1.breed = "GR";
		System.out.println("The Properties of dog are:");
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		
		System.out.println("The Behaviour of the dog is:");
		d1.run();
		d1.walk();
		d1.sleep();
	}
}

		
		

		
