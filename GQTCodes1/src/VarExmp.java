/**
 * 
 */

/**
 * @author Admin
 *
 */
public class VarExmp {

	/**
	 * @param args
	 */
	class Calculator {
		public int m;//instance variable
		public int n;//instance variable
		static public int c;//static variable,memory created only once in static segment
		
		void add() {
			int a = 10;//local variables 
			int b = 20;//local variables
			Calculator.c = a+b;
			Calculator.c = a-b;
			System.out.println("Calculator.c");
		}
		void sub() {
			m = 30;//assigning the values for instance variables
			n = 40;//assigning the values for instance variables
			Calculator.c = m-n;
			System.out.println("Calculator.c");
		}
	}
	public class VarCass {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Calculator c = new Calculator(); 
			 c.add();
			 c.sub();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
