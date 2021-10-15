import java.util.Scanner;  // Import the Scanner class
import java.io.File; // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Main {

	public static void main(String[] args) {
		// Start off with welcome and login options
		Bank b = new Bank();
		System.out.println("Welcome to the Bank!");
		System.out.println("Please Select an Option:");
		System.out.println("1) New User");
		System.out.println("2) Existing User");
		
		Scanner input = new Scanner(System.in);
		
		boolean validOption = false;
		do {
		int option = input.nextInt();
		User u;
		if (option == 1) {
			System.out.println("You've selected new user");
			u = createUser();
			b.addUser(u);
			validOption = true;
			
		} else if (option == 2) {
			System.out.println("You've selected Existing User\n This feature currently isn't working");
			u = createDefaultUser("George", 12334);
			b.addUser(u);
			u = createDefaultUser("Henry", 673928);
			b.addUser(u);
			u = createDefaultUser("Claire", 8970233);
			b.addUser(u);
			
			System.out.println("Enter your account ID");
            Scanner scannerID = new Scanner(System.in);
			String enteredID = scannerID.nextLine();
			
            if (b.checkUserID(enteredID)) {
                
            }

			
			
		} else {
			System.out.println("Not a valid option");
		}
		} while (validOption == false);
		
		System.out.println("Success");

	}
	
	public static User createUser() {
		// Create a new user object
		//Get an account id for the user
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter an account ID: ");
		String accountID = input.nextLine();
		
		//Set the user balance
		System.out.println();
		System.out.println("Please enter an account balance: ");
		float balance = input.nextFloat();
		
		User u = new User(accountID, balance);
		
		return u;
	}
	public static User createDefaultUser(String defaultID, float defaultBalance) {
		String accountID = defaultID;
		float balance = defaultBalance;
		User u = new User(accountID, balance);
		return u;
	}
	
	
//	try {
//	File myObj = new File("userList.txt");
//	if (myObj.createNewFile()) {
//		System.out.println("File created: " + myObj.getName());
//	} else {
//		System.out.println("File already exists.");
//	}
//} catch (IOException e ){
//	System.out.println("An error occured.");
//	e.printStackTrace();
//}
//
//try {
//      FileWriter myWriter = new FileWriter("userList.txt");
//      myWriter.write("Files in Java might be tricky, but it is fun enough!");
//      myWriter.close();
//      System.out.println("Successfully wrote to the file.");
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//
}
