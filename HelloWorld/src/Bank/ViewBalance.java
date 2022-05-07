package Bank;
import java.util.Scanner;

abstract class ViewBalance {
	public abstract void viewbalance(Accounts acc);
	}
	class ViewBal extends ViewBalance{
	Scanner sc = new Scanner(System.in);
	public void viewbalance(Accounts acc) {
	System.out.println("Enter your account no: ");
	int accnum = sc.nextInt();
	System.out.println("Enter your Pinno: ");
	int pin = sc.nextInt();
	if(accnum == acc.getAccountno()) {
	if(pin == acc.getPinno()) {
	System.out.println("Your available balance is: "+ acc.getAccountBalance());
	}
	}
	}
	}

	

}
