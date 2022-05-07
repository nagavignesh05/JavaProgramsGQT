/**
 * 
 */

/**
 * @author GQT-Trainer1
 *
 */

class Calculator {
	void add(int a,int b)//input--no output
	{
		int c = a+b;
		System.out.println(c);
	}
}
public class Launch3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(10,20);
		System.out.println(c);//paramater passed, no return value received
	}

}
