package Bank;

import java.util.Scanner;
public class AccountDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    Accounts acc = new Accounts();
		System.out.println("Enter Your Account Holder Name: ");
		String accname = sc.nextLine();
		System.out.println("Enter Your Account Balance: ");
		int accbalance = sc.nextInt();
		System.out.println("Enter Your Address: ");
		String addr = sc.next();
		System.out.println("Enter Your Account type: ");
		String acctype = sc.next();
		System.out.println("Enter Your Phone no: ");
		long phoneno = sc.nextLong();
		System.out.println("Enter Your Accountno: ");
		long accno = sc.nextLong();
		System.out.println("Enter Your Pinno: ");
		int pinno = sc.nextInt();
		acc.setAccountHolderName(accname);
		acc.setAccountBalance(accbalance);
		acc.setAddress(addr);
		acc.setAccountType(acctype);
		acc.setPhoneno(phoneno);
		acc.setAccountno(accno);
		acc.setPinno(pinno);
		// System.out.println(acc.getAccountHolderName());
		// System.out.println(acc.getAccountBalance());
		// System.out.println(acc.getAddress());
		// System.out.println(acc.getAccountType());
		// System.out.println(acc.getPhoneno());
		// System.out.println(acc.getAccountno());
		System.out.println("Enter your Choice: ");
		System.out.println(" 1. Withdraw. \n 2. Deposit. \n 3. View Balance. \n 4. Exit.");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
		BankOperation with = new BankOperation();
		with.withdraw(acc);
		break;
		case 2:
		BankOperation dep = new BankOperation();
		dep.deposit(acc);
		break;
		case 3:
	    ViewBal view = new ViewBal();
		view.viewbalance(acc);
		break;
		case 4:
		System.exit(choice);
		}
		sc.close();
		}
		}

}
