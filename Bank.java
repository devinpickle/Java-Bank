import java.util.*;

public class Bank {
	
	// Create array of users to store userID and float balance
	HashMap<String, String> users;

	String enteredID;

	//Constructor
	public Bank() {
		users = new HashMap<>();
		users.put("George", "12736.26");
		users.put("Henry", "786234.23");
		users.put("Claire", "363.65");
	}
	
	public void addUser(String accountID, String balance) {
		users.put(accountID, balance);
		System.out.println("A new user added to System");
	}
	
	public void getUsers() {
		//gets all bank users and balances
		for (String key : users.keySet()) {
			System.out.print("ID: " + key + ", ");
			System.out.println("Balance: " + users.get(key));
		}
	}

	public boolean getUser(String enteredID) {
		for (String key : users.keySet()) {
			if (key.equals(enteredID)) {
				System.out.println("ID: " + key + ", ");
				System.out.println("Balance: " + users.get(key));
				return true;
			}
		}
		return false;
	}

	public String getBalance(String enteredID) {
		String balance = "Error";
		for (String key : users.keySet()) {
			if (key.equals(enteredID)) {
				balance = users.get(key);
				return balance;
			}
		}
		return balance;
	}

	public void withdraw(float subtract, String enteredID) {
		float newBalance = Float.parseFloat(users.get(enteredID)) - subtract;
		users.put(enteredID, String.valueOf(newBalance));
	}

	public void deposit(float add, String enteredID) {
		float newBalance = Float.parseFloat(users.get(enteredID)) + add;
		users.put(enteredID, String.valueOf(newBalance));
	}
	
	public void userLogin(String enteredID) {
		this.enteredID = enteredID;
	}
	
	
}
