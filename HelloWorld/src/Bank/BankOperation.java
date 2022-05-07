package Bank;
import java.util.Scanner;
public class BankOperation {
	Scanner sc = new Scanner(System.in);
    public void withdraw(Accounts acc) {
	System.out.println("Enter your account no: ");
	int accnum = sc.nextInt();
	System.out.println("Enter your Pinno: ");
	int pin = sc.nextInt();
	if(accnum == acc.getAccountno()) {
	if(pin == acc.getPinno()) {
	System.out.println("Enter the amount to withdraw: ");
	double amount = sc.nextDouble();
	if(acc.getAccountBalance() == 0 || amount > acc.getAccountBalance()) {
	System.out.println("You cannot withdraw your amount.");
	System.out.println("Your available balance is :"+ acc.getAccountBalance());
	}else {
	amount = acc.getAccountBalance() - amount;
	System.out.println("Available balance is: "+ amount);
	}
	}
	}
	}
	public void deposit(Accounts acc) {
	System.out.println("Enter your account no: ");
	int accnum = sc.nextInt();
	System.out.println("Enter your Pinno: ");
	int pin = sc.nextInt();
	if(accnum == acc.getAccountno()) {
	if(pin == acc.getPinno()) {
	System.out.println("Enter amount to deposit: ");
	double amount = sc.nextDouble();
    amount = acc.getAccountBalance() + amount;
	System.out.println("Your available balance is: "+ amount);
	}
	}
	}
	}

}
