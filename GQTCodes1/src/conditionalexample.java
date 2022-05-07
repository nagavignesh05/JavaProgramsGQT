
public class conditionalexample {

	public static void main(String[] args) {
		int age = 25;
		int exp = 3;
		int salary = 10000;
		
		if(age >= 25) {
			if(exp >= 3) {
				if(salary <= 25000) {
					salary = salary + 5000;
					System.out.println("salary is Incremented");
					System.out.println("Your new salary is "+salary);
				}
				else {
					System.out.println("Your salary is more than 25000");
				}
			}
				else {
					System.out.println("Your experience is less than expected");
				}
		}
				else {
					System.out.println("Your age is less than 25");
				}
			}
		}
	


