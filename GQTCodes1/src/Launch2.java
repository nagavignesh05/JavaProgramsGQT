/**
 * 
 */

/**
 * @author GQT-Trainer1
 *
 */
class car{
	String model;
	String Brand;
	String Color;
	int Cost;
	
	void drive() {
		System.out.println("Car is been driven");
	}
	void start() {
		System.out.println("Car is been Started");
	}
	void stop() {
		System.out.println("Car is been Stopped");
	}
}	
	
public class Launch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.model = "AMGA45";
		c.Brand = "Benz";
		c.Color = "White";
		c.Cost = 5000000;
		System.out.println("The Properties of the car is:");
		System.out.println(c.model);
		System.out.println(c.Brand);
		System.out.println(c.Color);
		System.out.println(c.Cost);
		
		System.out.println("The Behaviour of the car is:");
		c.drive();
		c.start();
		c.stop();
		
		System.out.println("-----------------------------");
		
		car c1 = new car();
		c1.model = "Q45";
		c1.Brand = "Audi";
		c1.Color = "Red";
		c1.Cost = 7000000;
		System.out.println("The Properties of the car is:");
		System.out.println(c1.model);
		System.out.println(c1.Brand);
		System.out.println(c1.Color);
		System.out.println(c1.Cost);
		
		System.out.println("The Behaviour of the car is:");
		c1.drive();
		c1.start();
		c1.stop();
		
		System.out.println("-----------------------------");
		
		car c2 = new car();
		c2.model = "Indica";
		c2.Brand = "Tata";
		c2.Color = "White";
		c2.Cost = 500000;
		System.out.println("The Properties of the car is:");
		System.out.println(c2.model);
		System.out.println(c2.Brand);
		System.out.println(c2.Color);
		System.out.println(c2.Cost);
		
		System.out.println("The Behaviour of the car is:");
		c2.drive();
		c2.start();
		c2.stop();
		}

}
