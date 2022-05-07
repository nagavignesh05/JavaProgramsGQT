package Bank;

public class Account {
	private String AccountHolderName;
	private int AccountBalance;
	private String Address;
	private String AccountType;
	private long Phoneno;
	private long Accountno;
	private int Pinno;
	public int getPinno() {
	return Pinno;
    }
	public void setPinno(int pinno) {
	Pinno = pinno;
	}
	public String getAccountHolderName() {
	return AccountHolderName;
	public void setAccountHolderName(String accountHolderName) {
	AccountHolderName = accountHolderName;
	}
	public int getAccountBalance() {
	return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
	AccountBalance = accountBalance;
	}
	public String getAddress() {
	return Address;
	}
	public void setAddress(String address) {
	Address = address;
	}
	public String getAccountType() {
	return AccountType;
	}
	public void setAccountType(String accountType) {
	AccountType = accountType;
	}
	public long getPhoneno() {
	return Phoneno;
	}
	public void setPhoneno(long phoneno) {
	Phoneno = phoneno;
	}
	public long getAccountno() {
	return Accountno;
	}
	public void setAccountno(long accountno) {
	Accountno = accountno;
	}
	}
}



}
