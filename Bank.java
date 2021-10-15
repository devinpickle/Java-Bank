import java.util.*;

public class Bank {
	
	// Create array of users to store userID and float balance
	private ArrayList<User> users;
	
	//Constructor
	public Bank() {
		users = new ArrayList<>();
	}
	
	public void addUser(User user) {
		users.add(user);
		System.out.println("A new user added to System");
	}
	
	public void getUsers() {
		//gets all bank users and balances
		for (User u : users) {
			System.out.print("ID: " + u.getID() + ", ");
			System.out.println("Balance: " + u.getBalance());
		}
	}
	
	public boolean checkUserID(String enteredID) {
		// Currently not functioning right
        for (User u : users) {
			if (u.accountID == enteredID) {
				System.out.println("This is a valid id");
                return true;
			}
		}
		System.out.println("Not a valid ID");
		return false;
	}
	
	
}
