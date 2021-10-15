
public class User {
	String accountID;
	float accountBalance;
	
	//Constructor
	public User(String ID, float balance) {
		accountID = ID;
		accountBalance = balance;
	}
	
	public String getID() {
		return accountID;
	}
	
	public float getBalance() {
		return accountBalance;
	}
	
}
